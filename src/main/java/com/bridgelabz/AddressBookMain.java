package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {


    public static Map<String,AddressBook> addressBookMap= new HashMap<>();


    public static void addAddressBook() {
        Scanner in = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter the name of the new Address Book: ");
        addressBook.setAddressBookName(in.next());

        if (addressBookMap.containsKey(addressBook.getAddressBookName())) {
            System.out.println("Address Book already exists");
            return;
        }

        addressBookMap.put(addressBook.getAddressBookName(),addressBook);
        System.out.println("Address Book Added");
        System.out.println();

        boolean status= true;
        while(status){
            System.out.println("1. Add a Contact to this Address Book");
            System.out.println("2. Close this Address Book");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    addressBook.addContact();
                    System.out.println(addressBook);
                    System.out.println("Contact Added");
                    System.out.println();
                    break;
                case 2:
                    status=false;
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }

    public static void addContacts() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the address book you want to add contact:");
        String name = in.next();

        if(addressBookMap.containsKey(name)) {
            AddressBook Temp= addressBookMap.get(name);
            Temp.addContact();
            System.out.println(Temp);
            System.out.println("Contact Added");
            System.out.println();
        }
        else
            System.out.println("Given Address Book not Found\n");
    }

    public static void editContact(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the address book, the contact you want to edit:");
        String name= in.next();

        if(addressBookMap.containsKey(name)) {
            AddressBook Temp= addressBookMap.get(name);
            Temp.editDetails();
        }
        else
            System.out.println("Given Address Book not Found\n");
    }

    public static void deleteContact(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the address book, the contact you want to Delete :");
        String name= in.next();

        if(addressBookMap.containsKey(name)) {
            AddressBook Temp= addressBookMap.get(name);
            Temp.deleteDetails();
        }
        else
            System.out.println("Given Address Book not Found\n");
    }

    public static void displayAddressBook(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the address book you want to Display:");
        String name = in.next();
        if(addressBookMap.containsKey(name)) {
            AddressBook Temp = addressBookMap.get(name);
            System.out.println(Temp);
        }
        else
            System.out.println("Given Address Book not Found\n");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Scanner in = new Scanner(System.in);
        boolean status= true;
        while(status) {
            System.out.println("*******************\nSelect Option : ");
            System.out.println("1. Add New Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display Dictionary of Address Books");
            System.out.println("6. Display Address Books Of Contacts");
            System.out.println("7. Exit");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    addAddressBook();
                    System.out.println();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:

                    break;
                case 6:
                    displayAddressBook();
                    break;
                default:
                    status=false;
                    break;
            }
        }
    }
}