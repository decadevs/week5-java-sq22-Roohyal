package org.example.services.implementation;

import org.example.models.Book;
import org.example.models.Librarian;
import org.example.models.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplementation2Test {

   Book book = new Book("Joys Of Motherhood",true,2);
   Librarian librarian = new Librarian("Royal Mathias");
   LibraryServiceImplementation2 libraryServiceImplementation2 = new LibraryServiceImplementation2();


    @org.junit.jupiter.api.Test
    void getBookOnFirstCome() {
        assertNotNull(libraryServiceImplementation2.getBookOnFirstCome(book,librarian));
    }


}