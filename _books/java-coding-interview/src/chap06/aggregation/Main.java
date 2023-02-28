package chap06.aggregation;

public class Main {
    public static void main(String[] args) {
        Racket racket = new Racket("Babolet Pure Aero", 100, 300);
        TennisPlayer player = new TennisPlayer("Rafael", racket);

        System.out.println("Player " + player.getName() + " plays with " + player.getRacket().getType());
    }
}
