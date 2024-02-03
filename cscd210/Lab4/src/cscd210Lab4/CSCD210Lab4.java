package Lab4.src.cscd210Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CSCD210Lab4 {

    // Constants for base fees
    public static final double RES_BASE = 25.00;
    public static final double BUS_BASE = 1500.00;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Prompt for ending meter value
        System.out.print("Please enter the ending meter value: ");
        int endingMeterValue = kb.nextInt();

        // Prompt for the customer code
        System.out.print("Please enter the customer code (r or b): ");
        char customerCode = Character.toLowerCase(kb.next().charAt(0)); // Convert to lowercase for consistency

        // Calculate bill
        double bill = calculateBill(beginningMeterValue, endingMeterValue, customerCode);

        // Display results
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        System.out.println("\nCustomer Summary:");
        System.out.println("Customer Code:  " + customerCode);
        System.out.println("Beginning Meter Reading: " + beginningMeterValue);
        System.out.println("Ending Meter Reading:   " + endingMeterValue);
        System.out.println("Gallons Used:          " + calculateGallonsUsed(beginningMeterValue, endingMeterValue));
        System.out.println("Bill Amount:          " + df.format(bill));
    }

    // Calculates the gallons of water used
    private static double calculateGallonsUsed(int beginningMeterValue, int endingMeterValue) {
        int difference = endingMeterValue - beginningMeterValue;
        return difference / 10.0; // Divide by 10 to account for tenths of a gallon
    }

    // Calculates the bill amount based on customer code and usage
    private static double calculateBill(int beginningMeterValue, int endingMeterValue, char customerCode) {
        double gallonsUsed = calculateGallonsUsed(beginningMeterValue, endingMeterValue);
        double ratePerGallon;
        double baseFee;

        if (customerCode == 'r') {
            ratePerGallon = 0.0003;
            baseFee = RES_BASE;
        } else {
            ratePerGallon = gallonsUsed <= 999.9 ? 0.00002 : 0.00001; // Use ternary operator for business rate
            baseFee = BUS_BASE;
        }

        return baseFee + gallonsUsed * ratePerGallon;
    }
}
