package org.example.models;

import org.example.enums.Gender;

public class Librarian{
    private String fullName;
    ;
     // CONSTRUCTOR
    public Librarian(String fullName ) {
        this.fullName = fullName;

    }
 // GETTER
    public String getFullName() {
        return fullName;
    }
 //TO STRING
    @Override
    public String toString() {
        return "Librarian{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
