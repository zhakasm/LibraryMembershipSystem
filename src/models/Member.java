package models;

public class Member {
    private int id;
    private String name;
    private String email;
    private boolean active;

    public Member(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = true;
    }

    // Getters & Setters
    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return active; }

    public void renewMembership() {
        this.active = true;
    }

    public void cancelMembership() {
        this.active = false;
    }

    public String getMembershipDetails() {
        return "Standard Member";
    }

    @Override
    public String toString() {
        return id + "," + name + "," + email + "," + active;
    }
}