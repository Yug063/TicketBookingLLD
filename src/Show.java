import java.util.List;

public class Show {
    private String showId;
    private String showStartTiming;
    private Movie movie;
    private Screen screen;

    // Constructor
    public Show(String showId, String showStartTiming, Movie movie, Screen screen) {
        this.showId = showId;
        this.showStartTiming = showStartTiming;
        this.movie = movie;
        this.screen = screen;
    }

    // Getter and Setter for showId
    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    // Getter and Setter for showStartTiming
    public String getShowStartTiming() {
        return showStartTiming;
    }

    public void setShowStartTiming(String showStartTiming) {
        this.showStartTiming = showStartTiming;
    }

    // Getter and Setter for movie
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    // Getter and Setter for screen
    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
