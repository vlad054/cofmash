package machine;

import java.util.Scanner;
//import java.util.Arrays;

public class Main {

    static Scanner scn = new Scanner(System.in);
    static int water;
    static int milk;
    static int beans;
    static int money;
    static int dcups;

    public class Unit{
        public void inp(String str){

        }

    }

    public static void main(String[] args) {

        water = 400;
        milk = 540;
        beans = 120;
        money = 550;
        dcups = 9;

        String action;

        do {

            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            action = scn.next();

            switch(action){
                case "remaining":{
                    state();
                    break;
                }
                case "buy": {
                    buy();
                    break;
                }
                case "fill": {
                    fill();
                    break;
                }
                case "take": {
                    take();
                    break;
                }
            }


        }while(!action.equals("exit"));

    }

    private static void state(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(dcups + " of disposable cups");
        System.out.println(money + " of money");
    }

    private static void buy() {
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String kindOfCof = scn.next();

        switch (kindOfCof) {
            case "1": {
                if(water<250){
                    System.out.println("Sorry, not enough water!");
                    break;}

                if(beans<16){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;}

                if(dcups<1){
                    System.out.println("Sorry, not enough disposable cups!");
                    break;}

                dcups = dcups - 1;
                beans = beans - 16;
                water = water - 250;
                money = money + 4;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            }
            case "2": {

            if(water<350){
                System.out.println("Sorry, not enough water!");
                break;}

            if(beans<20){
                System.out.println("Sorry, not enough coffee beans!");
                break;}

            if(dcups<1){
                System.out.println("Sorry, not enough disposable cups!");
                break;}

            if(milk<75){
                System.out.println("Sorry, not enough disposable milk!");
                break;}

                water = water - 350;
                beans = beans - 20;
                milk = milk - 75;
                dcups = dcups - 1;
                money = money + 7;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            }
            case "3": {
                if(water<200){
                    System.out.println("Sorry, not enough water!");
                    break;}

                if(beans<12){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;}

                if(dcups<1){
                    System.out.println("Sorry, not enough disposable cups!");
                    break;}

                if(milk<100){
                    System.out.println("Sorry, not enough disposable milk!");
                    break;}

                water = water - 200;
                beans = beans - 12;
                milk = milk - 100;
                dcups = dcups - 1;
                money = money + 6;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            }
            case "back":
        }
    }
    private static void fill(){
        System.out.print("Write how many ml of water do you want to add: ");
        water = water + scn.nextInt();

        System.out.print("Write how many ml of milk do you want to add: ");
        milk = milk + scn.nextInt();

        System.out.print("Write how many grams of coffee beans do you want to add: ");
        beans = beans + scn.nextInt();

        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        dcups = dcups + scn.nextInt();
    }

    private static  void take(){
        System.out.println("I gave you $"+money);
        money = 0;
    }

}
