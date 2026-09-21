// Armstrong Number 153
import java.util.Scanner;

public class Problem_31 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int org = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        if(sum == org) {
            System.out.println("Armstrong !!");
        } else {
            System.out.println("Not");
        }
        sc.close();
    }
}
