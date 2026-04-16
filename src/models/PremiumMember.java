package models;

public class PremiumMember extends Member {

    public PremiumMember(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getMembershipDetails() {
        return "Premium Member (Extended benefits)";
    }
}