public class Problem_11 {
    public static void main(String[] args) {
        int i, sum = 0;
        int n = 20;

        for (i = 0; i <= n; i++) {
            if (n % 2 == 0) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
