package test;
import code.Movie;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class MovieTest {
    public static Movie movie;

    @BeforeAll
    public static void setupTest(){
        movie = new Movie("test1",10);
    }

    @Test
    public void getPriceCode() {

        Assertions.assertEquals(10, movie.getPriceCode());

    }

    @Test
    public void getTitle() {
        Assertions.assertEquals("test1", movie.getTitle());

    }


}
