//Abstarct class

abstract class shape {
    abstract void area();
}

class rectangle extends shape {
    double l = 10;
    double w = 5;

    void area() {
        System.out.println("Area: " + (l * w));
    }
}

class Triangle extends shape {
    double base = 10;
    double height = 6;

    void area() {
        System.out.println("Area: " + (0.50 * base * height));
    }
}

public class Problem_46 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        Triangle t = new Triangle();

        r.area();
        t.area();
    }
}
