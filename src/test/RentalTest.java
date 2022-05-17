package test;


import code.Movie;
import code.Rental;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RentalTest {
    public static Rental rental;
    public static Movie movie;

    @BeforeAll
    public static void setUpTest() {
        movie = new Movie("test", 1);
        rental = new Rental(movie, 20);
    }

    @Test
    void getDaysRented() {
        Assertions.assertEquals(20, rental.getDaysRented());
    }

    @Test
    void getMovie() {
        Assertions.assertEquals(movie, rental.getMovie());
    }
}
