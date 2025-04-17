package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservationsApp {

    public static void main(String[] args) {

        // Initializing the scanner
        Scanner input = new Scanner(System.in);

        // Requesting the inputs
        System.out.print("Please enter your name: ");
        String name = input.nextLine().trim();
        System.out.print("What date will you be coming? (MM/dd/yyyy): ");
        String dateProvided = input.next();
        System.out.print("How many tickets would you like? ");
        int ticketAmount = input.nextInt();

        // Splitting the name with the space and calling it a new list
        String[] nameParts = name.split(" ");

        // Using conditionals to explain that there should be a first and last name
        // and rearranging the name, converting the time format and the ticket
        if (nameParts.length == 2) {
            String reversedName = (nameParts[1]+", "+nameParts[0]);

            DateTimeFormatter dateDesired = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate date = LocalDate.parse(dateProvided, dateDesired);

            String ticket = (ticketAmount == 1) ? "ticket" : "tickets";

            System.out.println("\n"+ticketAmount+" "+ticket+" reserved for "+date+" under "+reversedName);
        }
        else {
            System.out.println("\nIncorrect name format: Enter your first and last name!");
        }
        }
    }

