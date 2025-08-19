import java.util.List;
import java.util.Map;

public class MovieController {
    private Map<City, List<Movie>> cityMovieListMap;
    private List<Movie> allMovieList;

    // Constructor
    public MovieController(Map<City, List<Movie>> cityMovieListMap, List<Movie> allMovieList) {
        this.cityMovieListMap = cityMovieListMap;
        this.allMovieList = allMovieList;
    }

    // Getter and Setter for cityMovieListMap
    public Map<City, List<Movie>> getCityMovieListMap() {
        return cityMovieListMap;
    }

    public void setCityMovieListMap(Map<City, List<Movie>> cityMovieListMap) {
        this.cityMovieListMap = cityMovieListMap;
    }

    // Getter and Setter for allMovieList
    public List<Movie> getAllMovieList() {
        return allMovieList;
    }

    public void setAllMovieList(List<Movie> allMovieList) {
        this.allMovieList = allMovieList;
    }
}
