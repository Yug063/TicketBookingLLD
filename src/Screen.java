import java.util.ArrayList;
import java.util.List;

public class Screen {
    private String seat_id;
    List<Seat> seats;

    Screen(String seat_id, List<Seat> seats) {
        this.seat_id=seat_id;
        this.seats=seats;
    }

    // Getter for seatId
    public String getSeat_id() {
        return seat_id;
    }

    // Setter for seatId
    public void setSeat_id(String seatId) {
        this.seat_id = seatId;
    }

    // Getter for seats
    public List<Seat> getSeats() {
        return seats;
    }

    // Setter for seats
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
