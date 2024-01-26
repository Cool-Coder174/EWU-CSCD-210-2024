package cscd210lab3;

import java.util.Scanner;

public class CSCD210Lab3 {
    public static final int YEAR = 2023;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Declare variables
        char ltr = ' ';
        String name = null;
        int birthyear = 0;

        // Prompt user for input
        System.out.print("Enter a single alphabetic character (lower case): ");
        ltr = kb.next().charAt(0);
        kb.nextLine();  // Consume leftover newline
        System.out.print("Enter your full name: ");
        name = kb.nextLine();
        System.out.print("Enter your birth year: ");
        birthyear = kb.nextInt();

        // Print the first and last letters of the name
        System.out.println("The first letter of your name is: " + name.charAt(0));
        System.out.println("The last letter of your name is: " + name.charAt(name.length() - 1));

        // Extract and print the middle name
        int firstSpaceIndex = name.indexOf(" ");
        int lastSpaceIndex = name.lastIndexOf(" ");
        if (firstSpaceIndex != lastSpaceIndex) {
            int middleNameStart = firstSpaceIndex + 1;
            int middleNameEnd = lastSpaceIndex;
            String middleName = name.substring(middleNameStart, middleNameEnd);
            System.out.println("Your middle name is: " + middleName);
        } else {
            System.out.println("No middle name detected.");
        }

        // Print the hash code
        System.out.println("Hash code: " + (name.substring(name.lastIndexOf(" ")).hashCode() + YEAR + birthyear));

        // Replace specified character with "?"
        for (int i = 0; i < name.length(); i++) {
            char currentChar = Character.toLowerCase(name.charAt(i));
            if (currentChar == Character.toLowerCase(ltr)) {
                name = name.replace(Character.valueOf(ltr), '?');
            }
        }
        System.out.println("Name with replaced characters: " + name);
        
        // Close the Scanner
        kb.close();
    }
}