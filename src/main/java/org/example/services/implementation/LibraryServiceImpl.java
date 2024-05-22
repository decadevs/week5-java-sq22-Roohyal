package org.example.services.implementation;
import org.example.models.*;
import org.example.services.LibraryService;

import java.util.PriorityQueue;

public class LibraryServiceImpl implements LibraryService {

    PriorityQueue<Person> personPriorityQueue;

    public LibraryServiceImpl() {
        personPriorityQueue = new PriorityQueue<>(new PersonComparator());
    }

// To add to the Queue
    @Override
    public void addToQueue(Person person){
        personPriorityQueue.add(person);
    }
   /// To Request for a book
    @Override
    public String requestBook(Person person, Book book ,String borrower) {
        if (!book.isAvailable()) {
            return "Book is not Available";
        }
       return person.getFullName() + " Has requested for " + book.getBookTitle();
    }
 // TO Borrow A Book
    @Override
    public String borrowBook( Book book, Librarian librarian) {
        if (personPriorityQueue.isEmpty()) {
            return "No one is on the queue";
        }else if (book.getCurrentNoOfCopies()==0){
           return "Books Taken";
        }
        Person person = personPriorityQueue.poll();

        book.setCurrentNoOfCopies(book.getCurrentNoOfCopies() - 1); // To decrease the number of copies
        assert person != null;
        return person.getFullName() + " Has borrowed " + book.getBookTitle() + " And it was issued by "  + librarian.getFullName() + ".";
    }


}
