package com.pluralsight;
import java.util.Scanner;
public class LibraryApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Starting off by making my array titled books
        Book[] books = new Book[20];
        books[0] = new Book(1, "978-1234567890", "The Holy Bible");
        books[1] = new Book(2, "978-0987654321", "The Holy Quran");
        books[2] = new Book(3, "978-8437076102", "The Origin of Species");
        books[3] = new Book(4, "978-1443434973", "1984");
        books[4] = new Book(5, "978-0140449143", "The Republic");
        books[5] = new Book(6, "978-0517053614", "The Complete Works of W.S.");
        books[6] = new Book(7, "978-0140447576", "The Communist Manifesto");
        books[7] = new Book(8, "978-0895267115", "Das Kapital");
        books[8] = new Book(9, "978-0937832387", "The Prince");
        books[9] = new Book(10, "978-0967686561", "The Book of Mormon");
        books[10] = new Book(11, "978-0143039952", "The Odyssey");
        books[11] = new Book(12, "978-1586380212", "The Upanishads");
        books[12] = new Book(13, "978-0679776192", "Tao Te Ching");
        books[13] = new Book(14, "978-0544174221", "The Hobbit");
        books[14] = new Book(15, "978-1324076148", "The Iliad");
        books[15] = new Book(16, "978-0140449334", "Meditations");
        books[16] = new Book(17, "978-0521657297", "Critique of Pure Reason");
        books[17] = new Book(18, "978-0192833983", "War and Peace");
        books[18] = new Book(19, "978-0486821955", "Don Quixote");
        books[19] = new Book(20, "978-8560860271", "Crime and Punishment");

        boolean accessing = true;  // Making a while loop with the boolean argument saying the library is being accessed
        while (accessing) { // which introduces the home screen
            System.out.println("\nAsteway's Library of Knowledge\n======== Home Screen ========");
            System.out.println("\nView Available Books ----- (A)");
            System.out.println("View Checked Out Books --- (C)");
            System.out.println("Exit --------------------- (X)");

            System.out.print("Please enter your choice: ");
            String choice = input.nextLine().trim().toUpperCase();
            System.out.print("\n");

            // Based on what the user entered as their choice in the menu, this switch statement will run through the
            // cases and proceed as such
            switch (choice) {

                case "A": // Using a for each loop that is running through the book array with an if condition saying if
                          // the book isn't checked out, that it should print
                    for (Book book : books) {
                        if (!book.getIsCheckedOut()) {
                            System.out.println(book);
                        }
                } System.out.println("\nEnter the book ID to checkout or select (E) to return to the home screen. ");
                    String inputId = input.nextLine().trim(); // Requesting the book ID as a string and
                    // storing it in the scanner while outside spaces are removed and forced to uppercase

                try { // Inputting all the following info into a try catch to make it still run in case of an error
                    int idToCheckOut = Integer.parseInt(inputId);
                    boolean bookFound = false;

                    for (Book book : books) {  // Running through the books array and using an if conditional
                                               // with reference to the getter to set bookFound variable as true
                        if (book.getId() == idToCheckOut) {
                            bookFound = true;

                            if (!book.getIsCheckedOut()) { // If the book isn't checked out, it'll do the following
                                System.out.println("Enter your name to check out the book: ");
                                // Storing the username as an array to make the name into proper format
                                String [] userName = input.nextLine().toLowerCase().trim().split("\\s+");
                                String userNameInput = userName[0].substring(0,1).toUpperCase() + userName[0]
                                        .substring(1) + " " + userName[1].substring(0,1).toUpperCase()
                                        + userName[1].substring(1);
                                System.out.println(book.checkOut(userNameInput));
                            } else {
                                System.out.println("Unfortunately \"" + book.getTitle() + "\" is already checked out.");
                            }
                            break;
                        }
                    }
                    if (!bookFound) { // If the book ID isn't correct, then it will print out the message
                        System.out.println("Book ID not found.");
                    }
                } catch (NumberFormatException e) {  // Catch statement to print out the invalid input message in case
                                                     // anything is still inputted incorrectly
                    System.out.println("Invalid input! Please enter and valid book ID. ");
                }
                break;

                case "C": // Case C to test if a checked out book is listed
                    boolean foundCheckedOut = false;
                    for (Book book : books) {
                        if (book.getIsCheckedOut()) {
                            System.out.println(book);
                            foundCheckedOut = true;
                    }
                }
                    if (!foundCheckedOut) {  // If not, it will print the following statement
                        System.out.println("There are no books currently checked out.\nPlease select (A) or (X).");
                        break;
                    }  // Also asks if the user wants to check in a book
                    System.out.println("\nEnter the book ID to check in or select (X) to exit to the home screen. ");
                    String checkInInput = input.nextLine().trim();

                    try { // Starting another try catch
                        int idToCheckIn = Integer.parseInt(checkInInput); // Converting the ID to an integer input
                        boolean bookFound = false;

                        for (Book book : books) { // Runs through the book array as a for each loop
                            if (book.getId() == idToCheckIn) {  // If the book ID is equal to the ID of the book
                                bookFound = true;               // being checked in, then the bookFound is true

                                if (book.getIsCheckedOut()) { // Successfully checks in the book
                                    System.out.println(book.checkIn());
                                } else {
                                    System.out.println("That book is already checked in! Back to home screen.");
                                }
                                break;
                            }
                        }
                        if (!bookFound) { // If this is false, it will say it isn't found
                            System.out.println("Book ID not found.");
                        }

                    } catch (NumberFormatException e) { // Catches any further invalid inputs for the ID
                        System.out.println("Invalid input! Please enter a valid book ID.");
                    }
                    break;

                case "X": // This is the exit option and says accessing is now false so it will break the loop
                    accessing = false;
                    System.out.println("Thank you for visiting and have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

