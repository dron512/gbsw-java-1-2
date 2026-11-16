package ex03;

public class AnoExample {
  public static void main(String[] args) {
    Ano a1 = new Ano();
    a1.p1.wake();
    a1.method1();
    a1.method2(new Person(){
      public void work(){
        System.out.println("프로그래밍기능사자격증을 공부합니다.");
      }
      public void wake(){
        System.out.println("공부를 열심히 합니다.");
        work();
      }
    });
  }
}
