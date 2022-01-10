package JavaPractice3;

// Find minimum number of currency notes and values that sum to given amount

import java.util.*;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Please enter an amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        countCurrency(amount);
    }
    static void countCurrency(int amount)
    {
        int[] notes = {1000,500,100,50,20,10,5,2,1};
        int[] noteCounter = new int[9];

        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        System.out.println("Currency Count: ");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println("$"+notes[i] + " Notes needed: "
                        + noteCounter[i]+ " Unit(s)");
            }
        }
    }
}
