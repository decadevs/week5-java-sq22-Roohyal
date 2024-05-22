package org.example.services.implementation;

import org.example.enums.Gender;
import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.Librarian;
import org.example.models.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {
    Person person = new Person("Tobi Bakre", 18,"S28", Gender.MALE, Role.SENIOR_STUDENT);
    Book book = new Book("Half of a Yellow Sun", true,2);
    Librarian librarian = new Librarian("Royal Mathias");

    LibraryServiceImpl libraryService = new LibraryServiceImpl();

    @Test
    void requestBook() {
        assertNotNull(libraryService.requestBook(person,book,"Senior student"));
    }

    @Test
    void borrowBook() {
        assertNotNull(libraryService.borrowBook(book,librarian));
    }



}