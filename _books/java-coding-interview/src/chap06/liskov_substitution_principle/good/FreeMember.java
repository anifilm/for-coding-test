package chap06.liskov_substitution_principle.good;

public class FreeMember implements TournamentJoiner {
    private final String name;

    public FreeMember(String name) {
        this.name = name;
    }

    @Override
    public void joinTournament() {
        System.out.println("Classic member joins tournament ...");
    }
}
