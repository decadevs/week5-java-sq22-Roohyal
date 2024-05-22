package org.example.models;

import org.example.enums.Gender;
import org.example.enums.Role;

 public class Person {
    private String fullName;
    private int age;
    private String id;
    private Gender gender;
    private Role role;




  //Constructors
     public Person(String fullName, int age, String id, Gender gender,Role role) {
         this.fullName = fullName;
         this.age = age;
         this.id = id;
         this.gender = gender;
         this.role = role;
     }

     //GETTERS
     public String getFullName() {
         return fullName;
     }

     public int getAge() {
         return age;
     }

     public String getId() {
         return id;
     }

     public Gender getGender() {
         return gender;
     }

    public Role getRole() {
        return role;
    }
  //TO STRING
     @Override
     public String toString() {
         return "Person{" +
                 "fullName='" + fullName + '\'' +
                 ", age=" + age +
                 ", id='" + id + '\'' +
                 ", gender=" + gender +
                 ", role=" + role +
                 '}';
     }
 }
