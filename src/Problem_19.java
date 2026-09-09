
// Problem19 Write a java Program to sum 1 to N numbers
import java.util.Scanner;

public class Problem_19 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("This Program SUM 1 to N numbers\n");
        System.out.print("Enter the N number: ");
        int n = sc.nextInt();

        for (i = 0; i <= n; i++) {
            sum += i;
            System.out.println("iteration: " + i + " Sum: " + sum);
        }
        System.out.println(sum);

        sc.close();
    }
}
