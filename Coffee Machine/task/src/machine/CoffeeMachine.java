package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scannerString = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;
    private static boolean working = true;

    public static void main(String[] args) {

        while (working) {
            System.out.println();
            action();
        }
    }

    static void action(){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scannerString.nextLine();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case  "remaining":
                remaining();
                break;
            case "exit":
                working = false;
                break;
        }
    }

    private static void remaining() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    private static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String pickCoffee = scannerString.nextLine();
        switch (pickCoffee) {
            case "1":
                int waterForEspresso = 250;
                int coffeeForEspresso = 16;
                int espressoCost = 4;
                if (cups >= 1){
                    if (water >= waterForEspresso){
                        if ( coffeeBeans >= coffeeForEspresso){
                            water -= waterForEspresso;
                            coffeeBeans -= coffeeForEspresso;
                            cups -= 1;
                            money += espressoCost;
                            System.out.println("I have enough resources, making you a coffee!");
                        } else {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    } else {
                        System.out.println("Sorry, not enough water!");
                    }
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "2":
                int waterForLatte = 350;
                int milkForLatte = 75;
                int coffeeForLatte = 20;
                int latteCost = 7;
                if (cups >= 1){
                    if (water >= waterForLatte){
                        if (milk >= milkForLatte){
                            if ( coffeeBeans >= coffeeForLatte){
                                water -= waterForLatte;
                                milk -=milkForLatte;
                                coffeeBeans -= coffeeForLatte;
                                cups -= 1;
                                money += latteCost;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                        } else {
                            System.out.println("Sorry, not enough milk!");
                        }
                    } else {
                        System.out.println("Sorry, not enough water!");
                    }
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "3":
                int waterForCappuccino = 200;
                int milkForCappuccino = 100;
                int coffeeForCappuccino = 12;
                int cappuccinoCost = 6;
                if (cups >= 1){
                    if (water >= waterForCappuccino){
                        if (milk >= milkForCappuccino){
                            if ( coffeeBeans >= coffeeForCappuccino){
                                water -= waterForCappuccino;
                                milk -= milkForCappuccino;
                                coffeeBeans -= coffeeForCappuccino;
                                cups -= 1;
                                money += cappuccinoCost;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                        } else {
                            System.out.println("Sorry, not enough milk!");
                        }
                    } else {
                        System.out.println("Sorry, not enough water!");
                    }
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "back":
                action();
                break;
        }
    }

    private static void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = scannerInt.nextInt();
        water += addWater;
        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = scannerInt.nextInt();
        milk += addMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addCoffeeBeans = scannerInt.nextInt();
        coffeeBeans += addCoffeeBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addCups = scannerInt.nextInt();
        cups += addCups;
        System.out.println();
    }

    private static void take(){
        System.out.println();
        System.out.println("I gave You $" + money);
        money = 0;
    }
}