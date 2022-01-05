package JavaPractice2;

// Write a program to show range of prime numbers from 2 to n

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int count = 0, i = 2;
        System.out.println("Prime numbers between 1 to " + n + " are:");
        for (int j = 2; j <= n; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2) System.out.print(j + "  ");
        }
    }
}
