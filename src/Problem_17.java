import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Variable: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Variable: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Variable: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.print("Greatest Number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print("Greatest Number is: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.print("Greatest Number is: " + num3);
        } else {
            System.out.print("All are Equel Numbers");
        }

        sc.close();
    }
}