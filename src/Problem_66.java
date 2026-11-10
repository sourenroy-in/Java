public class Problem_66 {
    public static void main(String[] args) {
        int n = 1000; // You can change this value to test with different numbers
        int result = sumOfSquares(n);
        System.out.println("The sum of squares from 1 to " + n + " is: " + result);
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}