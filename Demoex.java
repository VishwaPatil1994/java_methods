public class Demoex {
  int display(int x) {
    System.out.println("the number is: ");
    return x;
  }

  public static void main(String[] args) {
    Demoex obj = new Demoex();
    int x = 10;
    System.out.println(x);
    System.out.println(obj.display(x));
    return;
  }

}
