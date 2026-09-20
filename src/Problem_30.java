// 7. Write a Java program to show constructor overloading. There must be at least 3 constructors. You must use “this” keyword in the program.

class student {
    int id;
    String name;
    double marks;

    student() {
        this(0, "unknown", 0.0);
    }

    student(int id, String name) {
        this(id, name, 0.0);
    }

    student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}




public class Problem_30 {
     public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student(1, "souren");
        student s3 = new student(2, "x", 100);

        s1.display();
        s2.display();
        s3.display();
    }
    
}
