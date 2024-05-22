package org.example.models;

public class Book {
    private String bookTitle;
    private int currentNoOfCopies;
    private boolean isAvailable;

//CONSTRUCTOR
    public Book(String bookTitle,boolean isAvailable, int currentNoOfCopies) {
        this.bookTitle = bookTitle;
        this.isAvailable = isAvailable;
        this.currentNoOfCopies = currentNoOfCopies;
    }

// GETTER
    public String getBookTitle() {
        return bookTitle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getCurrentNoOfCopies() {
        return currentNoOfCopies;
    }
// SETTERS
    public void setCurrentNoOfCopies(int currentNoOfCopies) {
        this.currentNoOfCopies = currentNoOfCopies;
    }
 // TO STRING
    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", currentNoOfCopies=" + currentNoOfCopies +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
