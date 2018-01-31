package org.launchcode;

import java.util.Scanner;

public class SandwichShop
{
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            int goalForVeggies = 50;
            int goalForBurgers = 250;
            int goalForSubs = 180;
            int goalForSoup = 70;
            int veggiesSold;
            int burgersSold;
            int subsSold;
            int soupSold;
            boolean veggies = false;
            boolean burgers = false;
            boolean subs = false;
            boolean soups = false;

            System.out.println("Checking sales goals.");
            System.out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
            System.out.println("How many veggie sandwiches were sold today?");
            veggiesSold = keyboard.nextInt();

            if(veggiesSold >= goalForVeggies) {
                System.out.println("Made goal for veggies.");
                veggies = true;
            }
            else {
                System.out.println("Fell short for veggies.");
            }

            System.out.println("The sales goal for burgers is " + goalForBurgers);
            System.out.println("How many burgers were sold today?");
            burgersSold = keyboard.nextInt();

            if(burgersSold >= goalForBurgers) {
                System.out.println("Made goal for burgers.");
                burgers = true;

            }
            else {
                System.out.println("Fell short for burgers.");
            }

            System.out.println("The sales goal for subs is " + goalForSubs);
            System.out.println("How many subs were sold today?");
            subsSold = keyboard.nextInt();

            if(subsSold >= goalForSubs) {
                System.out.println("Made goal for subs.");
                subs = true;
            }
            else {
                System.out.println("Fell short for subs.");
            }

            System.out.println("The sales goal for soup is " + goalForSoup);
            System.out.println("How many soups were sold today?");
            soupSold = keyboard.nextInt();

            if(soupSold >= goalForSoup) {
                System.out.println("Made goal for soup.");
                soups = true;

            }
            else {
                System.out.println("Fell short for soup. ");
            }

            if(veggies && burgers && subs && soups) {
                System.out.println("Made goal for everything!");
            }
    }
}
