package JavaPractice2;

// Create a quiz for user to guess the summation of two random numbers

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Guess the summation:");
            int xx = sc.nextInt();
            int y = rand();
            if (xx == y) {
                point += 1;
                System.out.println("IT IS CORRECT!");
            }
            if (xx != y) {
                point -= 1;
            }
        }
        System.out.println("Your final point is: " + point);
    }
    static int rand(){
        int sum = 0;
        int[] d = new int[2];
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) Math.floor(Math.random() * 3);
            sum += d[i];
        }
        return sum;
    }
}

