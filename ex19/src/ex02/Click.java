package ex02;

public interface Click {
  void doClick();
//  void doClick1();
  default void doAA(){
    System.out.println("디폴트 메서드");
  }
  static void doBB(){
    System.out.println("스태틱 메서드");
  }
}
