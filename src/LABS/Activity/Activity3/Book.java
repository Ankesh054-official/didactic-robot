package LABS.Activity.Activity3;

import java.util.ArrayList;

public class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    /**
     * Constructor used to initilize instance variables.
     * @param bookId
     * @param bookName
     * @param authorName
     */
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    /**
     * @see Object#toString()
     * @return {@code String}
     */
    @Override
    public String toString() {
        return"\nBook Id: " + this.bookId + '\n' +
                "Book Name: " + this.bookName + '\n' +
                "Author Name: " + this.authorName;
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Wings of Fire", "Dr. APJ Abdul Kalam & Arun Tiwari"));
        books.add(new Book(2, "The Lean Startup", "Eric Ries"));
        books.add(new Book(3, "India 2020", "Dr. APJ Abdul Kalam & Y.S Rajan"));

        for(Book i : books){
            System.out.println(i);
        }
    }
}