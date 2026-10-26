// Class Implementing Multiple Interfaces

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable,Showable{
    public void print(){
        System.out.println("Printable method");
    }

    public void show(){
        System.out.println("Showable Method");
    }
}



public class Problem_50 {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.print();
        d.show();
    }
}
