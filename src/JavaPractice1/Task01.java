package JavaPractice1;

//Write a program to get a number from the user and print whether it is positive or negative.

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int i = sc.nextInt();
        if (i >= 0) {
            System.out.println("The given number is positive.");
        } else {
            System.out.println("The given number is negative.");
        }
    }
}
