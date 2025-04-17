package com.pluralsight;
import java.util.Scanner;
public class AddressBuilderApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Initiates the scanner
        StringBuilder info = new StringBuilder(); // Initiates the string builder titled 'info'

        // Printing the questions and using the scanner to store the input along
        // with the string builder appending what was inputted
        System.out.print("Please provide the following information" +
                "\nFull name: ");
        String fullName = input.nextLine().trim();
        info.append("\n"+fullName+"\n\n");

        System.out.print("\nBilling Street: ");
        String billingStreet = input.nextLine().trim();
        info.append("Billing Address: \n"+billingStreet);

        System.out.print("Billing City: ");
        String billingCity = input.nextLine().trim();
        info.append("\n"+billingCity+", ");

        System.out.print("Billing State: ");
        String billingState = input.nextLine().trim();
        info.append(billingState+" ");

        System.out.print("Billing Zip: ");
        String billingZip = input.nextLine().trim();
        info.append(billingZip);

        System.out.print("\nShipping Street: ");
        String shippingStreet = input.nextLine().trim();
        info.append("\n\nShipping Address: \n"+shippingStreet);

        System.out.print("Shipping City: ");
        String shippingCity = input.nextLine().trim();
        info.append("\n"+shippingCity+", ");

        System.out.print("Shipping State: ");
        String shippingState = input.nextLine().trim();
        info.append(shippingState+" ");

        System.out.print("Shipping Zip: ");
        String shippingZip = input.nextLine().trim();
        info.append(shippingZip);

        // Prints out a separator with the customer info below it
        System.out.print("\n**** Customer Information ****");

        // Prints out what was appended using the string builder based on the inputs
        System.out.println(info);
    }
}

