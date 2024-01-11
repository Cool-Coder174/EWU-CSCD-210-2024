package cscd210lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CSCD210Lab1 {
    public static void main(String[] args) throws Exception {

        int shoeSize, bYear;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your shoe size (no half-sizes): ");
        shoeSize = kb.nextInt();

        System.out.print("Enter your birth year(yyyy): ");
        bYear = kb.nextInt();

        DecimalFormat fmt = new DecimalFormat("00,00");

        System.out.println("your shoe size is the numbers befor the comma" + "and your age is the numbers after the comma " + fmt.format(((shoeSize * 5 + 50) * 20 +2019 - bYear)));

        kb.close(); 



    }
}
