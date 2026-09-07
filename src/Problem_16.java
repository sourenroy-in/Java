// Swap 2 numbers in java without using 3rd variable
import java.util.Scanner;

public class Problem_16 {
    


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.print("After Swapping:\n "+"Num1: "+num1+ "\n Num2: "+num2);
        sc.close();
    }
}
