package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        /**
         * WELCOME TO ADDRESS BOOK PROGRAM
         *
         * @author prem
         * @version 10.0
         * @since 21/08/2021
         */

        getInput();

    }

    /**
     * UC2 ABILIY TO ADD NEW CONTACT TO THE ADDRESS BOOK
     *
     * @author prem
     * @version 10.2
     * @since 21/08/2021
     */

    public static void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE FIRST NAME: ");
        String firstName = input.nextLine();
        System.out.print("ENTER THE LAST NAME: ");
        String lastName = input.nextLine();
        System.out.print("ENTER THE ADDRESS: ");
        String address = input.nextLine();
        System.out.print("ENTER THE CITY: ");
        String city = input.nextLine();
        System.out.print("ENTER THE STATE: ");
        String state = input.nextLine();
        System.out.print("ENTER THE EMAIL ID: ");
        String email = input.nextLine();
        System.out.print("ENTER THE ZIPCODE: ");
        Long zipcode = input.nextLong();
        System.out.print("ENTER THE PHONE NUMBER: ");
        Long phoneNumber = input.nextLong();

        Contact person = new Contact(firstName, lastName, address, city, state, email, zipcode, phoneNumber);

        person.display();

        /**
         * UC3 ABILITY TO EDIT EXISTING CONTACT PERSON USING THEIR NAME
         *
         * @author prem
         * @version 10.3
         * @since 21/08/2021
         */

        person.editDetails();

        person.display();

    }

}

