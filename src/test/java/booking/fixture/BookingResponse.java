package booking.fixture;

public class BookingResponse {
    private int bookingid;
    private Booking booking;

    public BookingResponse(int bookingid, Booking booking){
        this.bookingid = bookingid;
        this.booking = booking;
    }

    public int getBookingId() {
        return bookingid;
    }

    public Booking getBooking() {
        return booking;
    }


    @Override
    public String toString(){
        return "BookingResponse{" +
                "bookingid=" + bookingid +
                ", booking=" + booking +
                '}';
    }
}
