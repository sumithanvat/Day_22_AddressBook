package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book program");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        boolean flag1 = true;
        while (flag1) {

            System.out.println("******************\nSelect Option :");
            System.out.println("1.Add Contact\n2.Edit Contact\n3.Display\n4.Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.display();
                    break;
                case 4:
                    flag1 = false;
                    break;
                default:
                    System.out.println(option + " is not valid option");
                    break;
            }
        }
    }
}

