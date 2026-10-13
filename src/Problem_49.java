public class Problem_49 {
        public static void main(String[] args) {
        try{
             int a = 10/0;

        int arr[] = new int[3];
        arr[5] = 10;
        } catch(ArithmeticException e){
            System.out.println("Can not divide by ZERO");
        }
        finally {
            System.out.println("Error Occured");
        }
    }
}

