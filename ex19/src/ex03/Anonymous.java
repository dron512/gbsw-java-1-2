package ex03;

interface Calculator {
  int sum(int x, int y);
}
public class Anonymous {
  public void method(int arg1, int arg2) {
    Calculator calculator = new Calculator() {
//      x = 30; // 에러...
//      arg1 = 30;
      @Override
      public int sum(int x, int y) {
        return x + y + arg1 + arg2;
      }
    };
    int result = calculator.sum(30,40);
    System.out.println("result: " + result);
  }
}
