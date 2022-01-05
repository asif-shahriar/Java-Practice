package JavaPractice1;

//Write a program to check balance and withdraw money from ATM booth

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        double balance = 15000.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to check the balance only or withdraw money? If only balance, enter 1 and if withdraw enter 2");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("Your current balance is: " + balance);
        } else {
            System.out.println("How much money do you want to withdraw?");
            double i = sc.nextDouble();
            if (i <= balance) {
                double w = balance - i;
                System.out.println("Here is your withdraw amount: " + i);
                System.out.println("Here is your balance after withdrawal: " + w);
            } else {
                System.out.println("Opps! Insufficient balance.");
            }
        }
    }
}
