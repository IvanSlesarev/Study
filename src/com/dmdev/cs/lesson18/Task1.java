package com.dmdev.cs.lesson18;

public class Task1 {

    public static void main(String[] args) {
        int first = 10;
        int second = 50;
        int result = getMax(first, second);
        System.out.println("Max value is " + result);
    }

    public static int getMax(int value1, int value2){
        return value1 > value2 ? value1 : value2; // тернарный оператор
//        if (value1 > value2){
//            return value1;
//        } else {
//            return value2;
//        }

    }
}
