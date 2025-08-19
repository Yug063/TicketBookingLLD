import java.util.List;

public class Theatre {
    private String theatreId;
    private String theatreAdd;
    private List<Show> showList;

    // Constructor
    public Theatre(String theatreId, String theatreAdd, List<Show> showList) {
        this.theatreId = theatreId;
        this.theatreAdd = theatreAdd;
        this.showList = showList;
    }

    // Getter and Setter for theatreId
    public String getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    // Getter and Setter for theatreAdd
    public String getTheatreAdd() {
        return theatreAdd;
    }

    public void setTheatreAdd(String theatreAdd) {
        this.theatreAdd = theatreAdd;
    }

    // Getter and Setter for showList
    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
