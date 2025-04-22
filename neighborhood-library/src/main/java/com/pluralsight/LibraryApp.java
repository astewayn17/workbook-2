package com.pluralsight;
import java.util.Scanner;
public class LibraryApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Book[] books = new Book[20];

        books[0] = new Book(1, "978-1234567890", "The Holy Bible");
        books[1] = new Book(2, "978-0987654321", "The Holy Quran");
        books[2] = new Book(3, "978-8437076102", "The Origin of Species");
        books[3] = new Book(4, "978-1443434973", "1984");
        books[4] = new Book(5, "978-0140449143", "The Republic");
        books[5] = new Book(6, "978-0517053614", "The Complete Works of Shakespeare");
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

        boolean accessing = true;
        while (accessing) {
            System.out.println("\nAsteway's Library of Knowledge\n======== Home Screen ========");
            System.out.println("\nView Available Books ----- (B)");
            System.out.println("View Checked Out Books --- (C)");
            System.out.println("Exit --------------------- (E)");

            System.out.print("Please enter your choice: ");
            String choice = input.nextLine().trim().toUpperCase();
            System.out.print("\n");

            switch (choice) {

                case "B":
                    for (Book book : books) {
                        if (!book.getIsCheckedOut()) {
                            System.out.println(book);
                        }
                }System.out.println("\nEnter the book ID to checkout or select (X) to return to the home screen. ");

                String inputId = input.nextLine().trim().toUpperCase();

                try {
                    int idToCheckOut = Integer.parseInt(inputId);
                    boolean bookFound = false;

                    for (Book book : books) {
                        if (book.getId() == idToCheckOut) {
                            bookFound = true;

                            if (!book.getIsCheckedOut()) {
                                System.out.println("Enter your name to check out the book: ");
                                String [] userName = input.nextLine().toLowerCase().trim().split("\\s+");
                                String userNameInput = userName[0].substring(0,1).toUpperCase() + userName[0].substring(1)
                                        + " " + userName[1].substring(0,1).toUpperCase() + userName[1].substring(1);
                                book.checkOut(userNameInput);
                            } else {
                                System.out.println("That book is already checked out. ");
                            }
                            break;
                        }
                    }
                    if (!bookFound) {
                        System.out.println("Book ID not found.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter and valid book ID. ");
                }
                break;

                case "C":
                    for (Book book : books) {
                        if (book.getIsCheckedOut()) {
                            System.out.println(book);
                    }
                }
                    System.out.println("\nEnter the book ID to check in or select (X) to return to the home screen. ");
                    String checkInInput = input.nextLine().trim().toUpperCase();

                    try {
                        int idToCheckIn = Integer.parseInt(checkInInput);
                        boolean bookFound = false;

                        for (Book book : books) {
                            if (book.getId() == idToCheckIn) {
                                bookFound = true;

                                if (book.getIsCheckedOut()) {
                                    book.checkIn();
                                    System.out.println("Book successfully checked in!");
                                } else {
                                    System.out.println("That book is already checked in!");
                                }
                                break;
                            }
                        }
                        if (!bookFound) {
                            System.out.println("Book ID not found.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a valid book ID.");
                    }
                    break;

                case "E":
                    accessing = false;
                    System.out.println("Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }


    }
}

