package Lab5.src.cscd210lab5;

import java.util.Scanner;

public class CSCD210Lab5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int theNum, evens = 0, odds = 0, zeros = 0;

        do {
            // Ensure positive number input with informative prompt:
            System.out.print("Please enter a positive integer (or 0 to quit): ");
            theNum = kb.nextInt();

            if (theNum < 0) {
                System.out.println("Invalid input: Number must be non-negative.");
            } else {
                // Valid input: proceed with menu and operations

                int choice = 0;
                while (choice < 1 || choice > 4) {
                    // Clear any newline from previous input
                    kb.nextLine();

                    System.out.println();
                    System.out.println("Menu:");
                    System.out.println("1) Enter a new number");
                    System.out.println("2) Print even, odd, and zero counts");
                    System.out.println("3) Print prime numbers up to theNum");
                    System.out.println("4) Quit");
                    System.out.print("Choice --> ");

                    // Validate choice input:
                    try {
                        choice = kb.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input: Please enter a number between 1 and 4.");
                    }
                }

                switch (choice) {
                    case 1:
                        // Already handled in the do-while loop
                        break;
                    case 2:
                        // Count evens, odds, and zeros:
                        evens = countDigits(theNum, 2);
                        odds = countDigits(theNum, 2);
                        zeros = countDigits(theNum, 0);
                        System.out.println(theNum + " has " + evens + " evens, " + odds + " odds, and " + zeros + " zeros.");
                        break;
                    case 3:
                        // Print prime numbers:
                        if (theNum >= 2) {
                            System.out.print("Prime numbers from 2 to " + theNum + ": ");
                            printPrimes(2, theNum);
                            System.out.println();
                        } else {
                            System.out.println("No prime numbers up to 0.");
                        }
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        break;
                }
            }
        } while (theNum != 0); // Exit when 0 is entered
    }

    private static int countDigits(int num, int digit) {
        int count = 0;
        while (num != 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    private static void printPrimes(int lower, int upper) {
        for (int num = lower; num <= upper; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
 