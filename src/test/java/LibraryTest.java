import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        book1 = new Book("Harry Potter", "JK Rowland", "Si-fi");
        book2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance");
        book3 = new Book("Frankenstein", "Mary Shelley", "Si-fi");
        ArrayList<Book> booksToPutInLibrary = new ArrayList<>();
        booksToPutInLibrary.add(book1);
        booksToPutInLibrary.add(book2);
        booksToPutInLibrary.add(book3);
        library = new Library(booksToPutInLibrary);
    }

    @Test
    public void libraryHasStock(){
        assertEquals(3, library.getStock());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void canAddBookToStock(){
        Book book4 = new Book("The Alchemist", "Paulo Coelho", "Fiction");
        library.addBook(book4);
        assertEquals(4, library.getStock());

    }



    @Test
    public void cannotAddBookWhenLibraryCapacityIsFull() {
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        Book book5 = new Book("The Alchemist", "Paulo Coelho", "Fiction");
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.getStock());
    }


}
