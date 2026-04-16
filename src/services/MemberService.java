package services;

import models.Member;
import models.PremiumMember;

import java.util.ArrayList;
import java.util.List;

public class MemberService {

    private List<Member> members = new ArrayList<>();

    // CREATE
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully!");
    }

    // READ
    public void viewMembers() {
        if (members.isEmpty()) {
            System.out.println("No members found.");
            return;
        }

        for (Member m : members) {
            System.out.println(m + " | " + m.getMembershipDetails());
        }
    }

    // SEARCH
    public Member findMemberById(int id) {
        for (Member m : members) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    // UPDATE
    public void updateMember(int id, String newName, String newEmail) {
        Member m = findMemberById(id);

        if (m != null) {
            m.setName(newName);
            m.setEmail(newEmail);
            System.out.println("Member updated!");
        } else {
            System.out.println("Member not found.");
        }
    }

    // DELETE
    public void deleteMember(int id) {
        Member m = findMemberById(id);

        if (m != null) {
            members.remove(m);
            System.out.println("Member deleted!");
        } else {
            System.out.println("Member not found.");
        }
    }

    // RENEW
    public void renewMembership(int id) {
        Member m = findMemberById(id);

        if (m != null) {
            m.renewMembership();
            System.out.println("Membership renewed!");
        } else {
            System.out.println("Member not found.");
        }
    }

    // CANCEL
    public void cancelMembership(int id) {
        Member m = findMemberById(id);

        if (m != null) {
            m.cancelMembership();
            System.out.println("Membership cancelled!");
        } else {
            System.out.println("Member not found.");
        }
    }

    // GET ALL (нужно для файлов позже)
    public List<Member> getAllMembers() {
        return members;
    }

    // SET ALL (для загрузки из файла)
    public void setMembers(List<Member> members) {
        this.members = members;
    }
}