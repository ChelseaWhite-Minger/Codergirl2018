package org.launchcode;

import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {

        int size;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Multiplication Tables\n");

        System.out.println("How large would you like them?");
        size = keyboard.nextInt();

        while(size > 20 || size < 0) {

            System.out.println("Please enter a value between 0 and 20");
            size = keyboard.nextInt();

        }

        for (int i = 0; i < size + 1; i++) {

            for (int j = 0; j < size + 1; j++) {

                System.out.print(i + " * " + j + " = " + i * j + "\n");

            }
        }
    }
}



