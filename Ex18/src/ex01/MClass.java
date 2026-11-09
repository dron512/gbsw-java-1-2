package ex01;

class AA{
  public void doAAA(){
    System.out.println("파라메타 클래스");
  }
}

public class MClass {
  void doBB(){
    System.out.println("원래 메서드");
  }
  void doCC(AA aa, String bb){
    aa.doAAA();
    System.out.println(bb);
  }
}
