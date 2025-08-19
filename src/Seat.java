public class Seat {
    private int seat_number;
    private seatCateogry cateogry;

    Seat(int seat_number, seatCateogry cateogry){
        this.seat_number=seat_number;
        this.cateogry=cateogry;
    }

    public int getSeat_number(){
        return seat_number;
    }

    public seatCateogry getCateogry(){
        return cateogry;
    }

    public void setSeat_number(int seat_number){
        this.seat_number=seat_number;
    }

    public void setCateogry(seatCateogry cateogry){
        this.cateogry=cateogry;
    }
}
