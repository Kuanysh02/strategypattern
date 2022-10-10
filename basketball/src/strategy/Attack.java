package strategy;

public class Attack implements StyleStrategy {
    @Override
    public void play(String team) {
        System.out.println(team + " will play in attacking style");
    }
}
