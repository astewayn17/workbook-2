package com.pluralsight;
public class CellPhone {

    // These are the properties/variables that describe a cellphone
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // This is the constructor
    // In this case it's decided the values for the properties
    public CellPhone () {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

//    public newCellPhone (int serialNumber, String model, String carrier, String phoneNumber, String owner) {
//        this.serialNumber = serialNumber;
//        this.model = model;
//        this.carrier = carrier;
//        this.phoneNumber = phoneNumber;
//        this.owner = owner;
//    }

    // Method to print that the owner dials another number
    public void dial(String number) {
        System.out.println(owner + "'s phone is calling " + number);
    }

    // Getters and setters are below
    public int getSerialNumber() { return serialNumber; }
    public void setSerialNumber(int serialNumber) { this.serialNumber = serialNumber; }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getCarrier() { return carrier; }
    public void setCarrier(String carrier) { this.carrier = carrier; }
}
