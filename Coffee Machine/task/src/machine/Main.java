package machine;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        action();

    }

    protected static void action() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                CoffeeMachine.fill();
                action();
                break;
            case "take":
                CoffeeMachine.take();
                action();
                break;
            case "remaining":
                CoffeeMachine.printResources();
                break;
            case "exit":
                System.exit(0);
        }
        action();
    }

    protected static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String selection = scanner.next();
        switch (selection) {
            case "1":
                CoffeeMachine.espresso();
                break;
            case "2":
                CoffeeMachine.latte();
                break;
            case "3":
                CoffeeMachine.cappuccino();
                break;
            case "back":
                action();
                break;
        }
        action();
    }
}
