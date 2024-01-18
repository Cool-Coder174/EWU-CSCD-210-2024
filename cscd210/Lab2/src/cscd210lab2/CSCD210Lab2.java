package cscd210lab2;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.HashMap;

public class CSCD210Lab2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for input
        System.out.print("Please enter the skier's name: ");
        String skierName = input.nextLine();
        System.out.print("Please enter the winning time of the race (in seconds with two decimal places): ");
        double finishTime = input.nextDouble();

        // Calculate speeds and times
        HashMap<String, Double> speedsAndTimes = Speed(finishTime, 2500); // Call Speed method

  
        // Format and print output using HashMap
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("\nThe " + skierName + " was traveling at a rate of:");
        for (String speedType : speedsAndTimes.keySet()) {
            double value = speedsAndTimes.get(speedType);
            if (speedType.equals("time for one mile (minutes)")) {
                int minutes = (int) value;
                double seconds = value % 1 * 60; // Extract seconds from minutes
                System.out.println("It would take " + minutes + " minutes and " + df.format(seconds) + " seconds for " + skierName + " to ski one mile.");
            } else if (speedType.equals("time for 100 yards (seconds)")) {
                System.out.println("It would take " + df.format(value) + " seconds for " + skierName + " to ski 100 yards.");
            } else {
                String formattedValue = df.format(value);
                System.out.println(formattedValue + " " + speedType);
            }
        }

        // Close input scanner
        input.close();
    }

    // Over engineered method to display track times
    static HashMap<String, Double> Speed(double finishTime, int distance) {
        
        // Added error handling
        if (finishTime < 0 || distance < 0) {
            throw new IllegalArgumentException("Time and distance must be positive.");
        }
        
        HashMap<String, Double> speedsAndTimes = new HashMap<>();
        double meterPerSec = distance / finishTime;
        speedsAndTimes.put("meters per second", meterPerSec);
        speedsAndTimes.put("feet per second", meterPerSec * 3.2808);
        speedsAndTimes.put("kilometers per hour", meterPerSec * 3.6);
        speedsAndTimes.put("miles per hour", meterPerSec * 2.2369);
        double timeForMile = 1609.34 / meterPerSec;
        speedsAndTimes.put("time for one mile (minutes)", timeForMile / 60);
        speedsAndTimes.put("time for 100 yards (seconds)", 91.44 / meterPerSec);
        return speedsAndTimes;
    }
}
