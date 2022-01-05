package JavaPractice1;
//Take three numbers from the user and print the largest number

import java.util.Scanner;


public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        double i = sc.nextDouble();
        System.out.println("Give another number");
        double j = sc.nextDouble();
        System.out.println("Give the final number");
        double k = sc.nextDouble();

        if (i >= j && i >= k) System.out.println(i + " is the largest number.");
        else if (j >= i && j >= k) System.out.println(j + " is the largest number.");
        else System.out.println(k + " is the largest number.");
    }
}
