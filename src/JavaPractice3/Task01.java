package JavaPractice3;

// Write a program to calculate difference between today and your birthday

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task01 {
    public static void main(String[] args) throws ParseException {
            String birthDay = "27/08/1996 01:15:47 AM";
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
            Date date1 = formatter.parse(birthDay);
            Date date2 = new Date();
            long d = date2.getTime() - date1.getTime();
            long year = d / (1000l * 60 * 60 * 24 * 365);
            long day = d / (1000 * 60 * 60 * 24) % 365;
            long hour = (d / (1000 * 60 * 60)) % 24;
            long minutes = (d / (1000 * 60)) % 60;
            long second = (d / 1000) % 60;

            System.out.println("Year " + year);
            System.out.println("Day " + day);
            System.out.println("Hour " + hour);
            System.out.println("Minute " + minutes);
            System.out.println("Second " + second);
        }
}
