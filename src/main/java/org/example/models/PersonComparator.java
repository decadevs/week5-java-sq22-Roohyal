package org.example.models;

import org.example.enums.Role;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getRole()== Role.TEACHER && p2.getRole() != Role.TEACHER ){
            return -1;
        } else if (p1.getRole()!= Role.TEACHER && p2.getRole() == Role.TEACHER) {
            return 1;
        } else if (p1.getRole()==Role.SENIOR_STUDENT && p2.getRole() != Role.SENIOR_STUDENT) {
            return -1;
        } else if (p1.getRole()!=Role.SENIOR_STUDENT && p2.getRole() == Role.SENIOR_STUDENT) {
            return 1;
        }else if (p1.getRole() == Role.JUNIOR_STUDENT && p2.getRole() != Role.JUNIOR_STUDENT) {
            return -1;
        } else if (p1.getRole() != Role.JUNIOR_STUDENT && p2.getRole() == Role.JUNIOR_STUDENT) {
            return 1;
        }else{
           return 0;
        }

    }
}
