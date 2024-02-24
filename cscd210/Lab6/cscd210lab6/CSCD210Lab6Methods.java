package cscd210lab6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CSCD210Lab6Methods {

    /**
     * Reads a positive integer from the user.
     *
     * @param kb Scanner object for reading input
     * @return Positive integer entered by the user
     */
    public static int readPosNum(final Scanner kb) {
        while (true) {
            System.out.print("Enter a positive integer: ");
            try {
                int num = kb.nextInt();
                if (num > 0) {
                    return num;
                } else {
                    System.out.println("Invalid input: Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: Please enter an integer.");
                kb.nextLine(); // Clear the invalid input
            }
        }
    }

    /**
     * Displays the menu and prompts the user for a choice.
     *
     * @param kb Scanner object for reading input
     * @return User's choice from the menu
     */
    public static int menu(final Scanner kb) {
        System.out.println("\nMenu:");
        System.out.println("1. Read a positive integer");
        System.out.println("2. Check odd/even/zero");
        System.out.println("3. Light or heavy comparison");
        System.out.println("4. Print E pattern");
        System.out.println("5. Print digits in reverse");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");

        try {
            int choice = kb.nextInt();
            if (choice >= 1 && choice <= 6) {
                return choice;
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                return menu(kb); // Recursively call to try again
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter an integer.");
            kb.nextLine(); // Clear the invalid input
            return menu(kb); // Recursively call to try again
        }
    }

    /**
     * Determines if the number is odd, even, or zero.
     *
     * @param num The number to check
     */
    public static void oddEvenZero(final int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else if (num == 0) {
            System.out.println(num + " is zero.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    /**
     * Compares the entered number with another number entered by the user.
     *
     * @param num The first number
     * @param kb Scanner object for reading input
     */
    public static void lightOrHeavy(final int num, final Scanner kb) {
        System.out.print("Enter another integer for comparison: ");
        try {
            int compareNum = kb.nextInt();
            if (num > compareNum) {
                System.out.println(num + " is heavier than " + compareNum);
            } else if (num < compareNum) {
                System.out.println(num + " is lighter than " + compareNum);
            } else {
                System.out.println(num + " is equal to " + compareNum);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter an integer.");
            kb.nextLine(); // Clear the invalid input
            lightOrHeavy(num, kb); // Recursively call to try again
        }
    }

    /**
     * Prints a pattern of "E" characters based on the number.
     *
     * @param num The number representing the pattern size
     */
    public static void printE(final int num) {
        if (num <= 0) {
            System.out.println("Invalid input: Please enter a positive number.");
            return;
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("E");
            }
            System.out.println();
        }
    }

    public static void printReverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reversed);
    }
    

}
    