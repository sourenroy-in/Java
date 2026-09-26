//Class Overloading

//import java.util.Scanner;

class GrandParent {
    void showGrandParent() {
        System.out.println("This is GrandParent class");
    }
}

class Parent extends GrandParent {
    void showParent() {
        System.out.println("This is from Parent class");
    }
}

class child extends Parent {
    void age(int a) {
        System.out.println("AGE :" + a);
    }

    void show() {
        super.showGrandParent();
        System.out.println("This is from child class");
    }
}

public class Problem_37 {
    public static void main(String[] args) {
        child obj = new child();

        obj.showGrandParent();
        obj.showParent();
        obj.show();
        obj.age(21);

    }
}
