
// Problem18 Write a Java Program for print 1 to N number using Loop
import java.util.Scanner;

public class Problem_18 {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("This Program generate 1 to N numbers\n");
        System.out.print("Enter the N number: ");
        int n = sc.nextInt();

        for (i = 0; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
