package org.example.services.implementation;

import org.example.models.Book;
import org.example.models.Librarian;
import org.example.models.Person;
import org.example.services.LibraryService2;

import java.util.LinkedList;
import java.util.Queue;

public class LibraryServiceImplementation2 implements LibraryService2 {

    Queue<Person> personQueue;

    public LibraryServiceImplementation2() { personQueue = new LinkedList<>();
    }
 // TO ADD TO A QUEUE
    @Override
    public void addToQueueOnFirstCome(Person person) {
       personQueue.add(person);
    }
    // TO GET A BOOK USING FIFO
    @Override
    public String getBookOnFirstCome(Book bookTitle, Librarian librarian) {
        if (personQueue.isEmpty()){
            return " No one is one Queue ";
        } else if (bookTitle.getCurrentNoOfCopies() ==0) {
            return "Book Taken";
        }

        Person person = personQueue.poll();
        bookTitle.setCurrentNoOfCopies(bookTitle.getCurrentNoOfCopies() - 1); // Decrease the book copy count

        assert person != null;
        return person.getFullName() + " has borrowed " + bookTitle.getBookTitle() + " And it was issued by " + librarian.getFullName();

    }
}
