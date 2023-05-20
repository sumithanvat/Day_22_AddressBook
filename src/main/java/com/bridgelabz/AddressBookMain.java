package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

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

    public static void searchContact(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. search all Contacts from a specific City");
        System.out.println("2. search all Contacts from a specific State");
        int choice = in.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter name of the City: ");
                String cityName = in.next();
                List<ContactPerson> cityList = new ArrayList<>();
                addressBookMap.values().stream().forEach(addressBook -> cityList.addAll(addressBook.getContacts().stream().filter(
                        contact -> contact.getCity().equalsIgnoreCase(cityName)).toList()));
                int countByCity = cityList.size();
                System.out.println(countByCity + "Contact Found in " + cityName +" city");
                System.out.println(cityList);
                System.out.println();
                break;
            case 2:
                System.out.print("Enter name of the State: ");
                String stateName = in.next();
                List<ContactPerson> stateList = new ArrayList<>();
                addressBookMap.values().stream().forEach(addressBook -> stateList.addAll(addressBook.getContacts().stream().filter(
                        contact -> contact.getState().equalsIgnoreCase(stateName)).toList()));
                int countByState = stateList.size();
                System.out.println(countByState + "Contacts Found in " + stateName +" State");
                System.out.println(stateList);
                System.out.println();
                break;
            default:
                System.out.println("Please Choose valid option");
                searchContact();
                break;
        }
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

    public static void displaySortedAddressBook() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of address book you want to Display:");
        String name = in.next();
        if (addressBookMap.containsKey(name)) {
            AddressBook Temp = addressBookMap.get(name);
            List<ContactPerson> sortedList = Temp.getContacts().stream().sorted(Comparator.comparing(ContactPerson::getFirstName)).collect(Collectors.toList());
            System.out.println("The Sorted Contacts: ");
            System.out.println(sortedList);
            System.out.println();
        } else
            System.out.println("Given Address Book not Found");
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
            System.out.println("5. Search Contacts from a specific City or specific State");
            System.out.println("6. Display Dictionary of Address Books");
            System.out.println("7. Display Address Books Contacts");
            System.out.println("8. Display Contacts in Sorted Order based on person's name");
            System.out.println("9. exit");
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
                    searchContact();
                    break;
                case 6:
                    System.out.println(addressBookMap);
                    break;
                case 7:
                    displayAddressBook();
                    break;
                case 8:
                    displaySortedAddressBook();
                    break;
                default:
                    status=false;
            }
        }
    }
}

