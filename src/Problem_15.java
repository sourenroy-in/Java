// Swap 2 numbers in java
import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.print("After Swapping:\n "+"Num1: "+num1+ "\n Num2: "+num2);
        sc.close();
    }
}
