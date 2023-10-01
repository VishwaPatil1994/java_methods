public class Maths {
  void add() // without arguments and without return type
  {
    int a = 2;
    int b = 3;
    System.out.println("sum: " + (a + b));
  }

  public static void main(String[] args) {
    Maths m = new Maths();
    m.add();
  }
}
