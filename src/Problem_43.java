public class Problem_43 {
  public static void main(String[] args) {
    int x = 10;
    int y = 3;
    //Arithmetic Operators
    System.out.println(x + y); // 13
    System.out.println(x - y); // 7
    System.out.println(x * y); // 30
    System.out.println(x / y); // 3
    System.out.println(x % y); // 1

    int z = 5;
    ++z;
    System.out.println(z); // 6
    --z;
    System.out.println(z); // 5


    //Assignment Operators
    int a = 10;
    a += 5;
    System.out.println(a);


    //Comparison Operators
    int passwordLength = 5;

    System.out.println(passwordLength >= 8); // false, too short
    System.out.println(passwordLength < 8);  // true, needs more characters

    //Logical Operators
        boolean isLoggedIn = true;
    boolean isAdmin = false;

    System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
    System.out.println("Has access: " + (isLoggedIn || isAdmin));
    System.out.println("Not logged in: " + (!isLoggedIn));
  }
}

