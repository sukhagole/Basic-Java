package Assignment1;

import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {

        int luckyNumber = 0;
        int newNumber;

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the number to get the Lucky Number.");

        int UserInputNumber = scan.nextInt();

        int sum;

        do {
            sum = 0;
            while (UserInputNumber != 0) {
                sum = sum + UserInputNumber % 10;
                UserInputNumber = UserInputNumber / 10;
            }
            UserInputNumber = sum;
        } while (sum > 9); {
            System.out.println(" Lucky Number is :" + sum);

        }
    }
}

