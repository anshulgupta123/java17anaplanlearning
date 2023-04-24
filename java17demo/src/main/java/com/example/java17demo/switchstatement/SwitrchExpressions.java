package com.example.java17demo.switchstatement;

public class SwitrchExpressions {

    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        int numLetters = 0;
        switch (d) {
            case NORTH:
            case SOUTH:
                numLetters = 5;
                break;
            case EAST:
            case WEST:
                numLetters = 4;
                break;

        }
        System.out.println(numLetters);

        System.out.println(switch (d) {
                    // case NORTH, SOUTH -> 5;
                    //      default -> 4;
                    case NORTH, SOUTH:
                        yield 5;
                    default:
                        yield 4;
                }
        );
    }
}
