//Problem20 Creating a Array
import java.util.Scanner;

public class Problem_20 {
    public static void main(String[] args) {
        int i,n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Elements of an Array: ");

        // Scan all elements
        for(i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        };

        // show the Array
        for(i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        };

        sc.close();

    }
}
