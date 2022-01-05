package JavaPractice1;

// Write a program to check if inputted letter is small or capital.

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char i = sc.next().charAt(0);

        if (i >= 'A' && i <= 'Z') {
            System.out.println(i + " is upper case letter ");
        }
        if (i >= 'a' && i <= 'z') {
            System.out.println(i + " is lower case letter ");
        }
    }
}
