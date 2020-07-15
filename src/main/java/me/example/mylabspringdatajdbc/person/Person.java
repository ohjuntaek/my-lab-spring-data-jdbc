package me.example.mylabspringdatajdbc.person;

import org.springframework.data.annotation.AccessType;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.Period;

class Person {

    private final @Id Long id;
    private final String firstname, lastname;
    private final LocalDate birthday;
    private final int age;

    private String comment;
    private @AccessType(AccessType.Type.PROPERTY) String remarks;

    static Person of(String firstname, String lastname, LocalDate birthday) {

        return new Person(null, firstname, lastname, birthday,
                Period.between(birthday, LocalDate.now()).getYears());
    }

    Person(Long id, String firstname, String lastname, LocalDate birthday, int age) {

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.age = age;
    }

    Person withId(Long id) {
        return new Person(id, this.firstname, this.lastname, this.birthday, this.age);
    }

    void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
