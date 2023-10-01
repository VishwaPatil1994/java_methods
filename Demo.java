// Method without arguments and without return statements.

class Demo {
  void display() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    System.out.println("start");
    Demo d = new Demo();
    d.display(); // calling or invoking the method
    System.out.println("end");
  }
}