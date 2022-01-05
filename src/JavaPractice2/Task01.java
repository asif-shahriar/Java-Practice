package JavaPractice2;

// Write a program to sum of digits of a number by taking from user input

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int i = sc.nextInt();

        int sum = 0;
        while (i != 0) {
            sum = sum + i % 10;
            i = i / 10;
        }
        System.out.println("The sum of the given number is: " + sum);
    }
}
