package JavaPractice2;

// Write a program to make a digital tasbih where the program counts each time user press x until press 0

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Press x or 0");
            char c = sc.next().charAt(0);
            int Ascii = (int) c;
            if (Ascii == 120) {
                sum += 1;
                System.out.println("Tasbih counter: " + sum);
            }
            if (Ascii == 48) {
                System.out.println("Tasbih counter ends here.");
                System.out.println("Total tasbih count is: "+ sum);
                break;
            }
        }
    }
}
