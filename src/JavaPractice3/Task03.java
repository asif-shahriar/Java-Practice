package JavaPractice3;

// Find the max and min number from an array

public class Task03 {
    public static void main(String[] args) {
        int[] arr = {6,3,12,18,2,-1,9,23};
        System.out.println("The maximum number is: "+getMaxValue(arr));
        System.out.println("The minimum number is: "+getMinValue(arr));
    }
    static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
    static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}
