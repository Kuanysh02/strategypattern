package strategy;

public class Defence implements StyleStrategy {
    @Override
    public void play(String team) {
        System.out.println(team + " will play in defencive style");
    }
}
