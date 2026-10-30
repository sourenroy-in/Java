public class Parent{
    void show(){
        System.out.println("Parent Method");
    }
    void display(int a){
        System.out.println("Show: "+a);
    }
    void display(String a){
        System.out.println("Show: "+a);
    }
}

class child extends Parent{
    @Override 
    void show(){
        System.out.println("Child Method");
    }
}

public class Problem_53 {
    public static void main(String[] args) {
        child c = new child();

        c.display(10);
        c.display("xyz");
        c.show();
    }
}