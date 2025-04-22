package com.pluralsight;
public class Book {

    // Creating private variables to make them unable to modify without getters
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Instantiating the variables into the constructor using parameters for three of them
    public Book (int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }
    // Using getters to return the private variables
    public int getId() { return id; }
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public boolean getIsCheckedOut() { return isCheckedOut; }
    public String getCheckedOutTo() { return checkedOutTo; }

    // Checkout method to return if a book is already checked out or has been checked out
    public String checkOut(String name) {
        if (isCheckedOut) {
            return "This book is already checked out by " + checkedOutTo + ".";
        } else {
            isCheckedOut = true;
            checkedOutTo = name;
            return "\"" + title + "\" successfully checked out to " + name + ".";
        }
    }
    // Check in method to verify if check in is done and if a book is already checked in
    public String checkIn() {
        if (!isCheckedOut) {
            return "This book is already checked in.";
        } else {
            isCheckedOut = false;
            checkedOutTo = "";
            return "\"" + title + "\" successfully checked in.";
        }
    }
    // Simple way to use toString and print out the checked out book status along with a ternary if the book is gone
    public String toString() {
        return "ID: " + id + ", ISBN: " + isbn + ", Title: \"" + title + "\"" +
                (isCheckedOut ? " (Checked out to: " + checkedOutTo + ")" : "");
    }
}

