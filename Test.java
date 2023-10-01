// Method without arguments and with return statement.
public class Test {
  int display() {
    return 10;
  }

  public static void main(String[] args) {
    Test t = new Test();
    int result = t.display();
    System.out.println(result);
    System.out.println(t.display());

  }

}
