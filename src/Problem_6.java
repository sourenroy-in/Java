import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        b = sc.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Sub: " + (a - b));
        System.out.println("Mul: " + (a / b));
        System.out.println("Div: " + (a * b));
        System.out.println("Mod: " + (a % b));

        sc.close();
    }
}
