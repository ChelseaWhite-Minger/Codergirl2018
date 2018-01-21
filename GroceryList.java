package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String itemOne;
        String itemTwo;
        String itemThree;
        int qtyOne;
        int qtyTwo;
        int qtyThree;
        float priceOne;
        float priceTwo;
        float priceThree;
        float cost;


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Item 1?");
        itemOne = keyboard.nextLine();

        System.out.println("Item 2?");
        itemTwo = keyboard.nextLine();

        System.out.println("Item 3?");
        itemThree = keyboard.nextLine();

        System.out.println("Now please enter the quantity.");

        System.out.println("How many " + itemOne + "?");
        qtyOne = keyboard.nextInt();

        System.out.println("How many " + itemTwo + "?");
        qtyTwo = keyboard.nextInt();

        System.out.println("How many " + itemThree + "?");
        qtyThree = keyboard.nextInt();

        System.out.println("Now please enter the price of each item.");

        System.out.println("How much does one " + itemOne + " cost?");
        priceOne = keyboard.nextFloat();

        System.out.println("How much does one " + itemTwo + " cost?");
        priceTwo = keyboard.nextFloat();

        System.out.println("How much does one " + itemThree + " cost?");
        priceThree = keyboard.nextFloat();

        cost = (qtyOne * priceOne) + (qtyTwo * priceTwo) + (qtyThree * priceThree);

        System.out.println("Calculating your total grocery bill.");
        System.out.println("Your total cost is " + cost);




    }
}
