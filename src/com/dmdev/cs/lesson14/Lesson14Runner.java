package com.dmdev.cs.lesson14;

public class Lesson14Runner {

    public static void main(String[] args) {
//        byte, short, int, char, String, enum - только эти можно испольщовать со switch
        int month = 1;
       switch (month) {
           case 12:
           case 1:
           case 2:
               System.out.println("Winter");
               break;
           case 11:
               System.out.println("Autumn");
               break;
               case 3:
                   System.out.println("Spring");
                   break;
                   default:
                       System.out.println("Month is invalid");

       }
    }
}
