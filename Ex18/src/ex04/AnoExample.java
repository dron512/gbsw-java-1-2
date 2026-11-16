package ex04;

public class AnoExample {
  public static void main(String[] args) {
    Ano a1 = new Ano();
    a1.r.turnOn();
    a1.r.turnOff();
    a1.method();
    a1.method2( new RemoteControl(){
      public void turnOn(){
        System.out.println("라디오 전원 ON");
      }
      public void turnOff(){
        System.out.println("라이도 전원 OFF");
      }
    } );
//    a1.method().r2
  }
}
