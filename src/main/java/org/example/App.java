

//*
// *  UCF COP3330 Summer 2021 Assignment 18
// *  Copyright 2021 Steven Ortiz
// */

//C = (F − 32) × 5 / 9
//and
//
//F = (C × 9 / 5) + 32

//Press C to convert from Fahrenheit to Celsius.
//Press F to convert from Celsius to Fahrenheit.
//Your choice: C
//Please enter the temperature in Fahrenheit: 32
//The temperature in Celsius is 0.


package org.example;
import java.util.Scanner;
public class App {

    static Scanner in = new Scanner(System.in);

    private static int celsius() {

        System.out.print("Please enter the temperature in Celsius: ");
        return in.nextInt();
    }

    private static int fahrenheit() {

        System.out.print("Please enter the temperature in Fahrenheit: ");
        return in.nextInt();
    }

    public static void main(String[] args) {

        System.out.println("Press C to convert from Fahrenheit to Celsius.");

        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        String input = in.nextLine();

        System.out.println("Your choice: "+input+"");

        if (input.equals("C") || input.equals("c")) {

            int fahrenheit1 = fahrenheit();

            int C = ((fahrenheit1-32)*5/9);

            System.out.print("The temperature in Celsius is "+C+".");

        } else if (input.equals("F") || input.equals("f")) {

            int celsius1 = celsius();

            int F=((celsius1 *9/5)+32);

            System.out.print("The temperature in Fahrenheit is "+F+".");
        }
    }
}