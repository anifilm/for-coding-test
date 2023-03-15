package chap06.liskov_substitution_principle.good;

public abstract class Member implements TournamentJoiner, TournamentOrganizer {
    private final String name;

    public Member(String name) {
        this.name = name;
    }
}
