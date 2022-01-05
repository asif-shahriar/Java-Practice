package JavaPractice2;

// Find total price and total quantity from a string using regular expression.

public class Task04 {
    public static void main(String[] args) {
        String str = "1 piece saree 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        int sm = 0;
        int pr = 0;
        for (int ii = 0; ii < arr.length; ii += 2) {
            sm += Double.parseDouble(arr[ii]);
        }
        System.out.println("Total quantity: " + sm);
        for (int jj = 1; jj < arr.length; jj += 2) {
            pr += Double.parseDouble(arr[jj]);
        }
        System.out.println("Total quantity: " + pr);
    }
}
