public class Problem_5 {

    static class Box {
        double width; // instance variable
        double height; // instance variable
        double depth; // instance variable
    }

    static class Demo {
        public static void main(String args[]) {
            Box b1 = new Box();
            double vol;
            b1.width = 80;
            b1.height = 80;
            b1.depth = 80;
            vol = b1.width * b1.height * b1.depth;
            System.out.println("Volume is:" + vol);
        }
    }
}
