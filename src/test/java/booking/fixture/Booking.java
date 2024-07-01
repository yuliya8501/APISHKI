package booking.fixture;

public class Booking {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private String additionalneeds;
    private BookingDates bookingdates;



    public Booking(String firstname, String lastname, int totalprice, boolean depositpaid, BookingDates bookingdates, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;

    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getTotalPrice() {
        return totalprice;
    }

    public boolean isDepositPaid() {
        return depositpaid;
    }

    public String getAdditionalNeeds() {
        return additionalneeds;
    }

    public BookingDates getBookingDates() {
        return bookingdates;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setTotalPrice(int totalprice) {
        this.totalprice = totalprice;
    }

    public void setDepositPaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public void setAdditionalNeeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public void setBookingDates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "firstname=" + firstname + '\'' +
                ", lastname=" + lastname + '\'' +
                ", totalprice=" + totalprice + '\'' +
                ", depositpaid=" + depositpaid + '\'' +
                ", additionalneeds=" + additionalneeds + '\'' +
                ", bookingdates=" + bookingdates  +
                '}';

    }

}
