import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> stocks;

    public Library(ArrayList<Book> stocks){
        this.capacity = 4;
        this.stocks = stocks;
    }

    public int getStock(){
        return stocks.size();
    }

    public int getCapacity(){
        return capacity;
    }

    public void addBook(Book book) {
        if (getStock() < getCapacity()) {
            this.stocks.add(book);
            System.out.println("Book added to the library.");
        } else {
            System.out.println("Library capacity is full. Cannot add more books.");
        }
    }

}
