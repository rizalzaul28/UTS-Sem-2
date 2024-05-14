package Sum_of_positive;

public class Positive {
        public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {9, -7, 8, -3, 7}; // Example array
        int positiveSum = sum(numbers);
        System.out.println("Sum of positive integers: " + positiveSum);
    }
}