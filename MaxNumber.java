package Assignment1;

import java.util.Scanner;

    public class MaxNumber {

    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 number to check the biggest number.");
        firstNumber = scan.nextInt();
        secondNumber = scan.nextInt();
        thirdNumber = scan.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(" Max number is : " + firstNumber);
        } else if (secondNumber > thirdNumber) {
            System.out.println(" Max number is : " + secondNumber);
        } else {
            System.out.println(" Max Number is : " + thirdNumber);
        }
        scan.close();
    }
}
