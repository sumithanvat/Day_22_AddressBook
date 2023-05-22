package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddressBook {

    private List<ContactPerson> persons;

    public AddressBook() {
        persons = new ArrayList<>();
    }

    public void addPerson(ContactPerson person) {
        persons.add(person);
    }

    public void sortByCity() {
        // Sort the list by City using Java Streams and Comparator.comparing()
        Collections.sort(persons, Comparator.comparing(ContactPerson::getCity));
    }

    public void sortByState() {
        // Sort the list by State using Java Streams and Comparator.comparing()
        Collections.sort(persons, Comparator.comparing(ContactPerson::getState));
    }

    public void sortByZip() {
        // Sort the list by Zip using Java Streams and Comparator.comparing()
        Collections.sort(persons, Comparator.comparing(ContactPerson::getZip));
    }

    public void printAddressBook() {
        for (ContactPerson person : persons) {
            System.out.println(person);
        }
    }
}