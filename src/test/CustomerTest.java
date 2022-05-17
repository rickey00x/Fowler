package test;
import code.Movie;
import code.Customer;
import code.Rental;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class CustomerTest {

    public static Customer customer;

    @BeforeAll
    public static void setUpTest(){
        customer = new Customer("Hans");

        Movie movie = new Movie("Test", 2);

        Rental rental = new Rental(movie, 5);

        customer.addRental(rental);

    }

    @Test
    public void getName(){
        Assertions.assertEquals("Hans",customer.getName());
    }

    @Test
    public void statement() {
        String expected = "Rental Record for "+"Hans"+"\n" +
                "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n" +
                "\t" + "Test" + "\t" + "\t" + "5" + "\t" + "4.5" + "\n" +
                "Amount owed is " + "4.5" + "\n" +
                "You earned " + "1" + " frequent renter points";



       Assertions.assertEquals(expected, customer.statement());
    }

}
