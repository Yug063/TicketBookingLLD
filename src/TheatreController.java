import java.util.List;
import java.util.Map;

public class TheatreController {
    private Map<City, List<Theatre>> cityTheatreListMap;
    private List<Theatre> allTheatreList;

    // Constructor
    public TheatreController(Map<City, List<Theatre>> cityTheatreListMap, List<Theatre> allTheatreList) {
        this.cityTheatreListMap = cityTheatreListMap;
        this.allTheatreList = allTheatreList;
    }

    // Getter and Setter for cityTheatreListMap
    public Map<City, List<Theatre>> getCityTheatreListMap() {
        return cityTheatreListMap;
    }

    public void setCityTheatreListMap(Map<City, List<Theatre>> cityTheatreListMap) {
        this.cityTheatreListMap = cityTheatreListMap;
    }

    // Getter and Setter for allTheatreList
    public List<Theatre> getAllTheatreList() {
        return allTheatreList;
    }

    public void setAllTheatreList(List<Theatre> allTheatreList) {
        this.allTheatreList = allTheatreList;
    }
}
