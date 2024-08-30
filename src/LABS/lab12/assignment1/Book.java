package LABS.lab12.assignment1;

import java.util.ArrayList;

public class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    Book(int bookId, String bookName, String authorName){
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString(){
        return "Book Id: " + this.bookId + "\n" +
                "Book Name: " + this.bookName + "\n" +
                "Book Author: " + this.authorName + "\n";
    }
}

class Main{
    public static void main(String []args){
        ArrayList<Book> bookStack = new ArrayList<>();
        bookStack.add(new Book(1, "Book1", "Author of Book 1"));
        bookStack.add(new Book(2, "Book2", "Author of Book 2"));
        bookStack.add(new Book(3, "Book3", "Author of Book 3"));

        for(Book i: bookStack){
            System.out.println(i);
        }

    }
}
