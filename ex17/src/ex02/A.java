package ex02;
public class A {
  Parent parent = new Parent() {
    // 익명 인터페이스에서 변수와 메서드 추가
    int a = 10;
    public void doA() {
      System.out.println("doA");
    }
    public void parentMethod() {
      System.out.println(a);
      doA();
      System.out.println("parent method");
    }
  };
  public void method() {
//    System.out.println(parent.a);
//    parent.doA();
    parent.parentMethod();
  }
}
