package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        // Week 4 Challenge

        getConversion();

    }

    public static String getConversion() {
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> drinks = new ArrayList<>();

        colors.add("red");
        colors.add("brown");
        colors.add("yellow");
        colors.add("orange");

        drinks.add("pumpkin spiced latte");
        drinks.add("chai tea");
        drinks.add("hot cocoa");

        double celsius = 0;
        String response, word = "";

        do {
            System.out.println("Enter Temperature: ");
            double Temp = input.nextDouble();
            celsius = (((Temp - 32) * 5) / 9);
            String degree = "\u00B0";
            System.out.printf("The temperature in Celsius is: " + "%.2f", + celsius);
            System.out.println(degree);

            int colorIndex = rand.nextInt(colors.size()-1);
            String x = colors.get(colorIndex);

            int drinkIndex = rand.nextInt(drinks.size()-1);
            String y = drinks.get(drinkIndex);

            if (Temp < 45) {
                System.out.println("\nThe weather is a bit chilly for fall");
            } else if (Temp > 70) {
                System.out.println("\nThe weather is a bit warm for fall");
            } else if (Temp > 45 || Temp < 70) {
                System.out.println("\nToday's weather is a perfect fall day for a cup of " + y + ". The color of the leaves are " + x);
            }
            System.out.println("Would you like to enter another temperature Y(yes) or N(no): ");
            response = input.next();

        } while (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("yes"));
        System.out.println("");
        return word;
    }
}

