import java.util.Scanner;

//
public class Problem_35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int n = sc.nextInt();

        System.out.println("Enter elements of Array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        int key = 0;
        int pos = -1;

        System.out.print("Enter the Element you want to find: ");
        key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Element not Found !!");
        } else {

            System.out.println("Find the element at position: " + (pos + 1));
        }

        sc.close();
    }
}
