
//Palindrome Number
import java.util.Scanner;

public class Problem_33 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();

        int org = n;
        int sum = 0;

        while(n > 0){
            int digit = n%10;
            sum = sum * 10 + digit;
            n /= 10;
        }

        if(sum == org){
            System.out.println("Palindrome ");
        }else{
            System.out.println("NOT");
        }
        sc.close();
    }
}

