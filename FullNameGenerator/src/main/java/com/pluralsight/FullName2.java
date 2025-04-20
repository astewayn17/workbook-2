package com.pluralsight;

public class FullName2 {
    public static void main(String[] args) {

        String fullName = "Bilenie Tilahun";
        int fullName2 = fullName.indexOf("e");
        System.out.println(fullName.substring(0,6));
        System.out.println(fullName.substring(fullName2+ 1));
    }

}
