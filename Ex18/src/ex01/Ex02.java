package ex01;

public class Ex02 {

  public static void main(String[] args) {
    MClass m = new MClass();
    AA a1 = new AA();
    AA a2 = new AA() {
      public void doAAA() {
        System.out.println("새로운 파라메타 클래스");
      }
    };
//    m.doCC( a1 ,"새로운 문자열" );
//    m.doCC( a2 ,"새로운 문자열" );
    m.doCC(new AA() {
      public void doAAA() {
        System.out.println("새로운 파라메타 클래스");
      }
    }, "익명 문자열");

  }

}
