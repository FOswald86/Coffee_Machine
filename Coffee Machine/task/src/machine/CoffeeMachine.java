package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);
    static int money = 550;
    static int waterTank = 400;
    static int milkContainer = 540;
    static int coffeeBeansContainer = 120;
    static int disposableCups = 9;

    protected static void printResources() {
        System.out.printf("\nThe coffee machine has:\n" +
                        "%d ml of water\n" +
                        "%d ml of milk\n" +
                        "%d g of coffee beans\n" +
                        "%d disposable cups\n" +
                        "$%d of money\n"
                , waterTank, milkContainer, coffeeBeansContainer, disposableCups, money);
    }

    protected static void espresso() {
        if (waterTank >= 250 && coffeeBeansContainer >= 16 && disposableCups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            waterTank -= 250;
            coffeeBeansContainer -= 16;
            disposableCups--;
            money += 4;
        } else {
            if (waterTank < 250) {
                System.out.println("Sorry, not enough water!");
            } else if (coffeeBeansContainer < 16) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (disposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    protected static void latte() {
        if (waterTank >= 350 && milkContainer >= 75 && coffeeBeansContainer >= 20 && disposableCups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            waterTank -= 350;
            milkContainer -= 75;
            coffeeBeansContainer -= 20;
            disposableCups--;
            money += 7;
        } else {
            if (waterTank < 350) {
                System.out.println("Sorry, not enough water!");
            } else if (milkContainer < 75) {
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeBeansContainer < 20) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (disposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    protected static void cappuccino() {
        if (waterTank >= 200 && milkContainer >= 100 && coffeeBeansContainer >= 12 && disposableCups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            waterTank -= 200;
            milkContainer -= 100;
            coffeeBeansContainer -= 12;
            disposableCups--;
            money += 6;
        } else {
            if (waterTank < 200) {
                System.out.println("Sorry, not enough water!");
            } else if (milkContainer < 100) {
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeBeansContainer < 12) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (disposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    protected static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        waterTank += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milkContainer += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeansContainer += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        disposableCups += scanner.nextInt();
    }

    protected static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}
