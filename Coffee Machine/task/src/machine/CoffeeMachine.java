package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);
    static int money = 550;
    static int waterTank = 400;
    static int milkContainer = 540;
    static int coffeeBeansContainer = 120;
    static int disposableCups = 9;
    static String action;

    public static void main(String[] args) {

        action();

        /*
        int possibleCupsWater = waterTank / water;
        int possibleCupsMilk = milkContainer / milk;
        int possibleCupsCoffeeBeans = coffeeBeansContainer / coffeeBeans;
        int possibleCups = 0;

        if (possibleCupsWater <= possibleCupsMilk && possibleCupsWater <= possibleCupsCoffeeBeans) {
            possibleCups = possibleCupsWater;
        } else if (possibleCupsMilk <= possibleCupsWater && possibleCupsMilk <= possibleCupsCoffeeBeans) {
            possibleCups = possibleCupsMilk;
        } else if (possibleCupsCoffeeBeans <= possibleCupsWater && possibleCupsCoffeeBeans <= possibleCupsMilk) {
            possibleCups = possibleCupsCoffeeBeans;
        }

        System.out.println("Write how many cups of coffee you will need:");
        int neededCups = scanner.nextInt();

        if (neededCups == possibleCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (neededCups < possibleCups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", possibleCups - neededCups);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", possibleCups);
        }
        */
    }

    private static void printResources() {
        System.out.printf("\nThe coffee machine has:\n" +
                        "%d ml of water\n" +
                        "%d ml of milk\n" +
                        "%d g of coffee beans\n" +
                        "%d disposable cups\n" +
                        "$%d of money\n"
                , waterTank, milkContainer, coffeeBeansContainer, disposableCups, money);
    }

    private static void action() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        action = scanner.next();
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
            case "remaining":
                printResources();
                break;
            case "exit":
                System.exit(0);
        }
        action();
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String selection = scanner.next();
        switch (selection) {
            case "1":
                espresso();
                break;
            case "2":
                latte();
                break;
            case "3":
                cappuccino();
                break;
            case "back":
                action();
                break;
        }
        action();
    }

    private static void espresso() {
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

    private static void latte() {
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

    private static void cappuccino() {
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

    private static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        waterTank += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milkContainer += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeansContainer += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        disposableCups += scanner.nextInt();
        action();
    }

    private static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        action();
    }
}
