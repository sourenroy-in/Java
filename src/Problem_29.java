// Method Overloading and Method Overriding in Same Program

class Overloading {
    void show() {
        System.out.print("Parent Display Method!\n");
    }

    void add(int a){
        System.out.print("\nAdding only one: "+a);
    }

    void add(int a, int b){
        System.out.print("\nAdd: "+(a+b));
    }
}

class Overwrite extends Overloading{
    @Override 
    void show(){
        System.out.print("\nChild Display Method!!");
    }
}


public class Problem_29 {
     public static void main(String[] args) {
        Overwrite obj = new Overwrite();

        obj.show();

        obj.add(10);
        obj.add(10,20);
    }
}
