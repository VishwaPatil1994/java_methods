public class Metdemo {
  void multiplication(int a, int b, int c) // method with argument and without return type.
  {
    System.out.println("The multiplication of 3 numbers is " + (a * b * c));
  }

  public static void main(String[] args) {
    Metdemo obj = new Metdemo();
    obj.multiplication(3, 4, 5);
  }

}
