// Method Overloading
import java.util.Scanner;

class MethodOverloading {
    int add(int x, int y) {
        this.show();
        return x + y;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    void show() {
        System.out.println("This is a Example of Method Overloading!");
    }
}
public class Problem_28 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MethodOverloading obj = new MethodOverloading();

        System.out.println("Enter Two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Enter three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(obj.add(x, y));
        System.out.println(obj.add(a, b, c));

        sc.close();

    }
}

