package com.soubhagya.java.java8streams;

import java.util.List;

public class Person {
    private String firstName;
    private List<String> phoneNumbers;

    public Person(String firstName, List<String> phoneNumbers) {
        this.firstName = firstName;
        this.phoneNumbers = phoneNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
