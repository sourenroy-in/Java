
//Problem23 Sum of Positive & Negetive number
import java.util.Scanner;

public class Problem_23 {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the Elements: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ;

        int Psum = 0, Nsum = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                Psum += arr[i];
            } else {
                Nsum += arr[i];
            }
        }

        System.out.println("Sum of Negetive numbers: "+Nsum);
        System.out.println("Sum of Positive Numbers: "+Psum);

        sc.close();
    }
}
