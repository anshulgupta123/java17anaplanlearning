package com.example.java17demo.records;

public record CarRecord(String regNumber, String owner) implements I{


//    public CarRecord(String regNumber, String owner) {
//        if (regNumber.length() < 4) {
//            throw new IllegalArgumentException("Invalid registartion number");
//        }
//        this.regNumber = regNumber;
//        this.owner = owner;
//    }

    public CarRecord {
        if (regNumber.length() < 4) {
            throw new IllegalArgumentException("Invalid registartion number");
        }
    }

    public static String cuurent_year = "2023";

    public void invokeInstanceMethod() {
        System.out.println("Instance method invoked");
    }

    public static void invokeStaticMethod() {
        System.out.println("Static method invoked");
    }

    @Override
    public String owner() {
        return owner.toUpperCase();
    }
}
interface I{

}