package com.pluralsight;
public class Book {

    //
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //
    public Book (int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    //
    public int getId() { return id; }
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public boolean getIsCheckedOut() { return isCheckedOut; }
    public String getCheckedOutTo() { return checkedOutTo; }

    //
    public void checkOut(String name) {
        if (isCheckedOut) {
            System.out.println("This book is already checked out.\nPlease select another (A)" +
                    "or come another day once it has been returned - exit (E). ");
        } else {
            isCheckedOut = true;
            checkedOutTo = name;
        }
    }

    //
    public void checkIn() {
        if (!isCheckedOut) {
            System.out.println("You have entered an incorrect book that is already present." +
                    "\nPlease confirm your book again ");
        } else {
            isCheckedOut = false;
            checkedOutTo = "";
        }
    }
    public String toString() {
        return "Book ID: " + id +
                ", ISBN: " + isbn +
                ", Title: \"" + title + "\"" +
                (isCheckedOut ? " (Checked out to: " + checkedOutTo + ")" : " (Available)");
    }
}

