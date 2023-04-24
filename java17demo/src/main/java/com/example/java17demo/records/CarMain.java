package com.example.java17demo.records;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("agag242425", "Audi");
        System.out.println(car);
        System.out.println(car.getRegNumber());
        System.out.println(car.getOwner());
        CarRecord carRecord = new CarRecord("agag242425", "Audi");
     //   CarRecord carRecord1 = new CarRecord("45", "Audi");
        System.out.println(carRecord);
        System.out.println(carRecord.owner());
        System.out.println(carRecord.regNumber());
        CarRecord.invokeStaticMethod();
        System.out.println(CarRecord.cuurent_year);
        carRecord.invokeInstanceMethod();

    }
}

/*
class A extends CarRecord{

}*/


