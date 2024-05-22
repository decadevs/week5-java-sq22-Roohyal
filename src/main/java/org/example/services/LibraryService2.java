package org.example.services;

import org.example.models.Book;
import org.example.models.Librarian;
import org.example.models.Person;

public interface LibraryService2 {
    public void addToQueueOnFirstCome(Person person);

    public String getBookOnFirstCome(Book bookTitle, Librarian librarian);
}
