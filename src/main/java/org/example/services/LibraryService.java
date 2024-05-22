package org.example.services;

import org.example.models.Book;
import org.example.models.Librarian;
import org.example.models.Library;
import org.example.models.Person;

import java.util.PriorityQueue;

public interface LibraryService {


 public void addToQueue(Person person);

 public String requestBook(Person person, Book book, String borrower);

 public String borrowBook( Book book, Librarian librarian);

}
