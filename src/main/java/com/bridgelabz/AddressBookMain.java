package com.bridgelabz;

import java.util.*;
import java.util.function.Predicate;

public class AddressBookMain {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        // Add some persons to the address book
        addressBook.addPerson(new ContactPerson("Sumit Hanvat", "Jabalpur", "MP", "461002"));
        addressBook.addPerson(new ContactPerson("Arun Kumar", "Delhi", "DL", "480888"));
        addressBook.addPerson(new ContactPerson("Payal Jha", "Banglore", "KA", "604601"));

        // Sort by City
        System.out.println("Sort by City:");
        addressBook.sortByCity();
        addressBook.printAddressBook();

        // Sort by State
        System.out.println("Sort by State:");
        addressBook.sortByState();
        addressBook.printAddressBook();

        // Sort by Zip
        System.out.println("Sort by Zip:");
        addressBook.sortByZip();
        addressBook.printAddressBook();
    }
}