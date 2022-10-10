package strategy;

public class Default implements StyleStrategy {
    @Override
    public void play(String team) {
        System.out.println(team + " will play in default style");
    }
}
