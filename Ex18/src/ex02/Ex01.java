package ex02;

public class Ex01 {

  public static void main(String[] args) {
    A a = new A();
    a.method();
    // 이거는 호출 가능하다..
    a.p.parentMethod();
//    System.out.println(a.p.childField);
//    a.p.childMethod();

  }

}
