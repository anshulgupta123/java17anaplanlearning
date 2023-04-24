package com.example.java17demo.patternmatching;

public class PatternMatching {

    public static void whatTypeOfObject(Object o) {
        switch (o) {
            case String s -> System.out.println("This is string");
            case Integer i -> System.out.println("This is Integer");
            case null -> System.out.println("This is null");
            default -> System.out.println("This is not recognized");
        }
    }

    public static void infoOntype(Object o) {
        switch (o) {
            case String s && s.startsWith("A") -> System.out.println("This is string begin with A");
            case Integer i && i > 10 -> System.out.println("This is Integer greater than 10");
            case null -> System.out.println("This is null");
            default -> System.out.println("This is not recognized");
        }
    }

    public static void main(String[] args) {
        whatTypeOfObject(10);
        whatTypeOfObject("Hello");
        whatTypeOfObject(null);
        whatTypeOfObject('v');

        infoOntype(100);
        infoOntype("Anshul");
        infoOntype(null);
        infoOntype('v');


    }
}
