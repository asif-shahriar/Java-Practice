package JavaPractice1;

//  Write a program to check if the provided user credentials are valid during login

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your email");
        String i = sc.next();
        System.out.println("Enter Your password");
        String j = sc.next();

        String de = "abc@gmail.com";
        String dp = "1234";
        if (de.equals(i) && dp.equals(j)) {
            System.out.println("You shall pass");
        } else {
            System.out.println("YOU SHALL NOT PASSSSSSS!!!");
        }
    }
}
