class calculator{

    int num;
    void  setNum(int num) {
        this.num = num;
    }

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }
    void show() {
        System.out.println("Numbers: "+ this.num);
    }

}

public class Problem_51 {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.setNum(10);
        c.show();

        System.out.println("Sum = "+c.add(10, 10));
        System.out.println("Sum = "+c.add(10, 20, 30));
        System.out.println("Sum = "+c.add(30.12, 40.12));
        
    }
}
