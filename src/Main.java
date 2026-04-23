import models.Member;
import models.PremiumMember;
import services.MemberService;
import utils.FileHandler;
import utils.Validator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MemberService service = new MemberService();

        // Load data
        service.setMembers(FileHandler.loadFromFile());

        while (true) {
            System.out.println("\n===== Library Membership System =====");
            System.out.println("1. Register Member");
            System.out.println("2. View Members");
            System.out.println("3. Update Member");
            System.out.println("4. Delete Member");
            System.out.println("5. Renew Membership");
            System.out.println("6. Cancel Membership");
            System.out.println("7. Export to CSV");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    if (!Validator.isNotEmpty(name)) {
                        System.out.println("Name cannot be empty!");
                        break;
                    }

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    if (!Validator.isValidEmail(email)) {
                        System.out.println("Invalid email format!");
                        break;
                    }

                    System.out.print("Is Premium? (yes/no): ");
                    String type = scanner.nextLine();

                    if (type.equalsIgnoreCase("yes")) {
                        service.addMember(new PremiumMember(id, name, email));
                    } else {
                        service.addMember(new Member(id, name, email));
                    }
                    break;

                case 2:
                    service.viewMembers();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("New Name: ");
                    name = scanner.nextLine();

                    System.out.print("New Email: ");
                    email = scanner.nextLine();

                    service.updateMember(id, name, email);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    service.deleteMember(id);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    service.renewMembership(id);
                    break;

                case 6:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    service.cancelMembership(id);
                    break;

                case 7:
                    FileHandler.exportToCSV(service.getAllMembers());
                    break;

                case 8:
                    FileHandler.saveToFile(service.getAllMembers());
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}