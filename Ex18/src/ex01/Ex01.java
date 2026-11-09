package ex01;
public class Ex01 {
  // 익명 -> 일회용
  // 필드로 선언
  MInterface mInterface = new MInterface() {
    int a = 10;
    public void doAAAA(){
      System.out.println("필드에 선언된 doAAAA()");
    }
    public void doAA(){
      System.out.println("새로운 인터페이스 메서드");
    }
  };
  MClass mClass = new MClass(){
//    public void doBB(){
//      System.out.println("새로운 클래스 메서드");
//    }
  };
  public static void main(String[] args) {
    Ex01 ex01 = new Ex01();
    ex01.mInterface.doAA();
    ex01.mClass.doBB();
    ex01.method();
  }
  // 메서드에 변수로 선언
  void method(){
    MInterface mInterface = new MInterface() {
      public void doAA(){
        System.out.println("메서드안에 선언된 doAA()");
      }
    };
    MClass mClass = new MClass(){
    };
    mInterface.doAA();
    mClass.doBB();
  }
}
