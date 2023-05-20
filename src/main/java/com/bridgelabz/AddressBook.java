package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);

    public ContactPerson createContact() {
        ContactPerson person = new ContactPerson("sc.next", "sc.next", "sc.next", "sc.next", "sc.next", "sc.next", "sc.next", "sc.next");
        System.out.print("Enter First Name: ");
        person.setFirstName(sc.next());
        System.out.print("Enter Last Name: ");
        person.setLastName(sc.next());
        System.out.print("Enter Address: ");
        person.setAddress(sc.next());
        System.out.print("Enter City: ");
        person.setCity(sc.next());
        System.out.print("Enter State: ");
        person.setState(sc.next());
        System.out.print("Enter email: ");
        person.setEmail(sc.next());
        System.out.print("Enter ZipCode: ");
        person.setZip(sc.next());
        System.out.print("Enter Phone Number: ");
        person.setPhoneNumber(sc.next());
        System.out.println("created new contact");
        return person;
    }

    public void addContact() {
        ContactPerson contactPerson = createContact();
        System.out.println(contactPerson);
        System.out.println("Contact added successfully");
    }

    public void editContact() {
        Scanner sc = new Scanner(System.in);
        ArrayList<ContactPerson> addressBook1 = new ArrayList<>();

        boolean isContactFound = false;
        System.out.println("Enter Name to edit Contact");
        String name = sc.next();
        for (ContactPerson contactPerson : addressBook1) {
            if (name.equalsIgnoreCase(contactPerson.getFirstName())) {
                isContactFound = true;
                System.out.print("Enter First Name :");
                contactPerson.setFirstName(sc.next());
                System.out.print("Enter Last Name :");
                contactPerson.setLastName(sc.next());
                System.out.print("Enter Address :");
                contactPerson.setAddress(sc.next());
                System.out.print("Enter City :");
                contactPerson.setCity(sc.next());
                System.out.print("Enter State :");
                contactPerson.setState(sc.next());
                System.out.print("Enter email :");
                contactPerson.setEmail(sc.next());
                System.out.print("Enter ZipCode :");
                contactPerson.setZip(sc.next());
                System.out.print("Enter Phone Number :");
                contactPerson.setPhoneNumber(sc.next());
                System.out.println(contactPerson);
                break;
            }
        }
        if (isContactFound) {
            System.out.println("Contact Updated Successfully..");
        } else {
            System.out.println("Oops...Contact not found");
        }
    }
    void display() {
        ArrayList<ContactPerson> addressBook1 = new ArrayList<>();

        for (ContactPerson person : addressBook1) {
            System.out.println(person);
        }
    }
}
