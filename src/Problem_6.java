import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        b = sc.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        sc.close();
    }
}
