class Box {
    double width; // instance variable
    double height; // instance variable
    double depth; // instance variable
}

public class Problem_4 {

    class Demo {
        public static void main(String args[]) {
            Box b1 = new Box();
            double vol;
            b1.width = 10;
            b1.height = 20;
            b1.depth = 17;
            vol = b1.width * b1.height * b1.depth;
            System.out.println("Volume is:" + vol);
        }
    }
}
