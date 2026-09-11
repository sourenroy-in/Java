
// Problem21 Sum & average of all Array Elements
import java.util.Scanner;;

public class Problem_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the size of an Array: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        };

        int sum=0;
        int avg =0;
        for (int i=0; i <arr.length; i++) {

            sum += arr[i];
        }
        avg = sum/arr.length;

        System.out.println("The sum of all elements in array: "+sum);
        System.out.println("The Average of elements in array: "+avg);
        
        sc.close();
    }

}
