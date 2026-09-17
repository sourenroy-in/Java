//The sum of all Elements using FOR loop
import java.util.Scanner;

public class Problem_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the End: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        // Sum of all int 1 to n;
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += n;
            i++;
        }
        System.out.print("The sum of all Elements: " + sum);

        sc.close();
    }
}
