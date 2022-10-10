import strategy.Attack;
import strategy.Default;
import strategy.Defence;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Lak ers");
        Team team2 = new Team("Prince");

        team1.setPlayingStyle(new Attack());
        team2.setPlayingStyle(new Default());

        team1.setPlayingStyle(new Defence());


    }
}