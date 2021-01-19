package Assignment1;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter the number to check the PRIME NUMBER.");
        int number = scn.nextInt();

        boolean remainderZero = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                remainderZero = true;
                break;
            }
        }
        if (!remainderZero)
            System.out.println( number + " is a prime number.");
        else
            System.out.println( number + " is not a prime number.");

        scn.close();   // Will close the scanner for memory purpose.
    }

}
