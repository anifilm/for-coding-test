package chap06.liskov_substitution_principle.bad;

public class PremiumMember extends Member {
    public PremiumMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println("Premium member joins tournament ...");
    }

    @Override
    public void organizeTournament() {
        System.out.println("Premium member organize tournament ...");
    }
}
