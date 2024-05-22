package org.example;

import org.example.enums.Gender;
import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.Librarian;
import org.example.models.Person;
import org.example.services.implementation.LibraryServiceImpl;
import org.example.services.implementation.LibraryServiceImplementation2;

public class Main {
    public static void main(String[] args) {
        //Creating instances of the person class
        Person juniorStudent = new Person("Maria Chike",15, "J25", Gender.FEMALE, Role.JUNIOR_STUDENT);
        Person seniorStudent = new Person("Tobi Bakre",15,"J25",Gender.MALE,Role.SENIOR_STUDENT);
        Person teacher = new Person("Nengi Hampson",28,"T23",Gender.FEMALE,Role.TEACHER);

        //Creating instances of the book class
        Book book = new Book("Joys Of Motherhood",true,2);
        Book book1 = new Book("Half of a Yellow Sun", true,2);
        Librarian librarian = new Librarian("Royal Mathias");
         //  THIS IS WITH PRIORITY
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        // THIS IS WITHOUT PRIORITY
        LibraryServiceImplementation2 libraryServiceImplementation2 = new LibraryServiceImplementation2();
       // THIS IS TO ADD TO THE QUEUE
        libraryService.addToQueue(juniorStudent);
        libraryService.addToQueue(seniorStudent);
        libraryService.addToQueue(teacher);


//         THIS IS WITHOUT PRIORITY
        libraryServiceImplementation2.addToQueueOnFirstCome(juniorStudent);
        libraryServiceImplementation2.addToQueueOnFirstCome(seniorStudent);
        libraryServiceImplementation2.addToQueueOnFirstCome(teacher);



        System.out.println("This is the Request");
        System.out.println(libraryService.requestBook(juniorStudent,book,"Junior Student"));
        System.out.println("**************************************************************");

        System.out.println("THIS IS WITH PRIORITY");
        System.out.println(libraryService.borrowBook(book, librarian));
        System.out.println(libraryService.borrowBook(book, librarian));
        System.out.println(libraryService.borrowBook(book, librarian));
        System.out.println("**************************************************************");


        System.out.println("THIS IS WITHOUT PRIORITY");
        System.out.println(libraryServiceImplementation2.getBookOnFirstCome(book1,librarian));
        System.out.println(libraryServiceImplementation2.getBookOnFirstCome(book1,librarian));
        System.out.println(libraryServiceImplementation2.getBookOnFirstCome(book1,librarian));
        System.out.println("****************************************************************");


    }
}