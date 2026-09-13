import java.util.Scanner;

public class Problem_22 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i;

        System.out.println("Enter the size of an Array: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the Elements: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ;

        int min = arr[0];
        int max = arr[0];

        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.print("Min: " + min);

        sc.close();
    }
}