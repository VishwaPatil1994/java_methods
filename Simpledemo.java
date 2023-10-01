  public class Simpledemo {
    void multiplication(int a, int b) {
      if ((a % 2 == 0) && (b % 2 == 0)) {
        System.out.println("Sum of two number is " + (a + b));
      } else {
        System.out.println("multiplication of two number is " + (a * b));
      }
    }

    public static void main(String[] args) {
      Simpledemo obj = new Simpledemo();
      obj.multiplication(10, 40);
    }

  }
