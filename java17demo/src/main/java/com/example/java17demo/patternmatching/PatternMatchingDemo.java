package com.example.java17demo.patternmatching;

sealed class Vehicle permits Car, Boat {

    public void getMessage() {
        System.out.println("This is a Vehicle");
    }
}

final class Car extends Vehicle {
    public void getMessage() {
        System.out.println("This is a car");
    }
}

final class Boat extends Vehicle {

}

public class PatternMatchingDemo {

    public static void vehicleType(Vehicle v) {
        switch (v) {
            case Car c -> {
                System.out.println("This is car");
                c.getMessage();
            }
            case Boat b -> System.out.println("This is boat");
            default -> System.out.println("This is not recognized");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Boat();
        Vehicle v1 = new Car();
        vehicleType(v);
        vehicleType(v1);
    }
}
