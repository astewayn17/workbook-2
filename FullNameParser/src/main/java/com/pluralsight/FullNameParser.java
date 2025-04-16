package com.pluralsight;

// Importing the scanner
import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        // Initializing the scanner - called it cheese cuz why not :/
        Scanner cheese = new Scanner(System.in);

        // Requesting the name inputs
        System.out.print("Please enter your name: ");
        String name = cheese.nextLine().trim();

        // Splitting the string into an array to get the different name parts
        String[] nameParts = name.split(" ");

        // Calling the name part variables (middle name is "none" my default)
        String first;
        String middle = "(none)";
        String last;

        // Using the conditions to ask if there are different parts in the name once split
        if (nameParts.length == 2) {
            first = nameParts[0];
            last = nameParts[1];
        } else if (nameParts.length == 3) {
            first = nameParts[0];
            middle = nameParts[1];
            last = nameParts[2];
        } else {
            System.out.println ("Incorrect format -" +
                    " enter your name in the 'first last' or 'first middle last' format.");
            return;
        }

        // Prints out the name
        System.out.println("First name: "+first+"\nMiddle name: "+middle+"\nLast name: "+last);

    }
}
