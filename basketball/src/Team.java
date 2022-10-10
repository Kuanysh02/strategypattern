import strategy.StyleStrategy;

public class Team {
    private String name;
    private StyleStrategy style;

    public Team(String name) {
        this.name = name;
    }

    public void setPlayingStyle(StyleStrategy playingStyle) {
        this.style = playingStyle;
        playingStyle.play(name);
    }
}
