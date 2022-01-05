package JavaPractice1;

// Write a program to calculate CGPA and find grade

public class Task05 {
    public static void main(String[] args) {
        double m[] = {4, 3.3, 3.0, 2.7, 2.3};
        double sum = 0;
        int credit = 3;
        double cgpa = 0;
        for (int i = 0; i < m.length; i++) {
            sum += (m[i]*credit);
            cgpa = sum/(credit*5);
        }
        if(cgpa >= 3.3 && cgpa <= 4.0) System.out.println("Your cgpa is A");
        if(cgpa >= 3.0 && cgpa <= 3.29) System.out.println("Your cgpa is A-");
        if(cgpa >= 2.7 && cgpa <= 2.99) System.out.println("Your cgpa is B");
        if(cgpa >= 2.3 && cgpa <= 2.69) System.out.println("Your cgpa is B-");
    }
}
