package booking.fixture;

public class BookingDates {

        private String checkin;
        private String checkout;

    public BookingDates(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getCheckIn() {
        return checkin;
    }

    public String getCheckOut() {
        return checkout;
    }

    public void setCheckIn(String checkin) {
        this.checkin = checkin;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString(){
        return "BookingDates{" +
                "checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }
}
