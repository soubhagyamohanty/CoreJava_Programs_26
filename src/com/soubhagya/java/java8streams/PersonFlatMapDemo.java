package com.soubhagya.java.java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFlatMapDemo {
    static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Soubhagya", Arrays.asList("123", "456", "789")),
                new Person("Priyanka", Arrays.asList("456", "789", "871", "124")),
                new Person("Deepak", Arrays.asList("233", "455", "291", "125")));
          //personList.stream().map(Person::getPhoneNumbers).forEach(System.out::println);
        List<List<String>>  mapList = personList.stream().map(Person::getPhoneNumbers)
                .collect(Collectors.toList());
        System.out.println("mapList: " + mapList);
        List<String>  mapListName = personList.stream().map(Person::getFirstName)
                .collect(Collectors.toList());
        System.out.println("mapListName: " + mapListName);

        List<String> flatMapList = personList.stream().flatMap(person->person.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("flatMapList: " + flatMapList);
    }
}
