package utils;

import models.Member;
import models.PremiumMember;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private static final String FILE_NAME = "data/members.txt";

    // SAVE
    public static void saveToFile(List<Member> members) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Member m : members) {
                writer.write(m.toString());
                writer.newLine();
            }

            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    // LOAD
    public static List<Member> loadFromFile() {
        List<Member> members = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String email = parts[2];
                boolean active = Boolean.parseBoolean(parts[3]);

                Member member;

                if (name.toLowerCase().contains("premium")) {
                    member = new PremiumMember(id, name, email);
                } else {
                    member = new Member(id, name, email);
                }

                if (!active) {
                    member.cancelMembership();
                }

                members.add(member);
            }

        } catch (IOException e) {
            System.out.println("No previous data found.");
        }

        return members;
    }

    // 🔥 NEW: EXPORT TO CSV
    public static void exportToCSV(List<Member> members) {
        String fileName = "data/members.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write("ID,Name,Email,Active,Type");
            writer.newLine();

            for (Member m : members) {
                writer.write(
                        m.getId() + "," +
                                m.getName() + "," +
                                m.getEmail() + "," +
                                m.isActive() + "," +
                                m.getMembershipDetails()
                );
                writer.newLine();
            }

            System.out.println("Data exported to CSV!");

        } catch (IOException e) {
            System.out.println("Error exporting CSV.");
        }
    }
}