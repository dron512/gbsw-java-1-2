package ex02;

public class Parent {
  public void parentMethod(){
    System.out.println("원래 메서드");
  }
}
class A{
  Parent p = new Parent(){
    int childField = 10;
    public void childMethod(){
      System.out.println("자식 메서드");
    }
    public void parentMethod(){
      System.out.println(childField);
      childMethod();
      System.out.println("새로운 메서드");
    }
  };
  public void method(){
//    System.out.println(p.childField);
//    p.childMethod();
    p.parentMethod();
  }

}
