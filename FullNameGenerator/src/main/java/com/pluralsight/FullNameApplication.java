package com.pluralsight;

// Importing the scanner
import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        // Initializing the scanner - called it cheese cuz why not :/
        Scanner cheese = new Scanner(System.in);

        // Requesting the name inputs
        System.out.print("Please enter your name \nFirst name: ");
        String firstName = cheese.nextLine();
        System.out.print("Middle name: ");
        String middleName = cheese.nextLine();
        System.out.print("Last name: ");
        String lastName = cheese.nextLine();
        System.out.print("Suffix: ");
        String suffix = cheese.nextLine();

        // Adjusting for the condition if middle name and suffix are empty
        middleName = middleName.trim().isEmpty() ? "" : " "+middleName.trim();
        suffix = suffix.trim().isEmpty() ? "" : ", "+suffix.trim();

        // Adding up and printing it out
        System.out.println("Full name: " + firstName.trim() + middleName +" "+ lastName.trim() + suffix);
    }
}
