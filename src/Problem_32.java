//Write a java program to find Krishnamurthy number

import java.util.Scanner;

public class Problem_32 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int org = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n /= 10;
        }

        if(sum == org) {
            System.out.println("Krishnamurthy Number");
        }else{
            System.out.println("Not");
        }
        sc.close();
    }
}
