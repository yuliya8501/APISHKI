package booking.api;

import booking.fixture.BookingDates;
import booking.fixture.BookingResponse;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import booking.fixture.Booking;

import static io.restassured.RestAssured.given;

public class CreateBookingTest {

    private static final String URL = "https://restful-booker.herokuapp.com";
    private static final String BOOKING_PATH = "/booking";

    @Test(description = "Create booking")

    public void createBooking(){

        BookingDates bookingDates = new BookingDates("2024-08-01", "2024-08-08");
        Booking booking = new Booking("John", "Doe", 111, true, bookingDates, "Lunch");

        System.out.println("1:Create" + booking);

        BookingResponse response = given()
                .baseUri(URL)
                .contentType(ContentType.JSON)
                .accept("application/json")
                .body(booking)
                .when()
                .post(BOOKING_PATH)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(BookingResponse.class);

        System.out.println("2:" + response.getBookingId());

        Booking getBookingResponse = given()
                .baseUri(URL)
                .basePath(BOOKING_PATH + "/" + response.getBookingId())
                .contentType(ContentType.JSON)
                .accept("application/json")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(Booking.class);


    }

}
