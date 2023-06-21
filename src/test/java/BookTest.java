import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before() {
        book1 = new Book("Harry Potter", "JK Rowland", "Si-fi");
        book2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance");
        book3 = new Book("Frankenstein", "Mary Shelley", "Si-fi");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Harry Potter", book1.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("JK Rowland", book1.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Si-fi", book1.getGenre());
    }



}
