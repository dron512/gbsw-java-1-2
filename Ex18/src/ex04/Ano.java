package ex04;

public class Ano {
  // 필드 (클래스 (멤버)변수)
  RemoteControl r = new RemoteControl() {
    @Override
    public void turnOn() {
      System.out.println("TV 전원 ON");
    }
    @Override
    public void turnOff() {
      System.out.println("TV 전원 OFF");
    }
  };
  // 메서드
  void method(){
    RemoteControl r2 = new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("컴퓨터 전원 ON");
      }
      @Override
      public void turnOff() {
        System.out.println("컴퓨터 전원 OFF");
      }
    };
    r2.turnOff();
    r2.turnOn();
  }
  // 파라메타
  void method2(RemoteControl rc){
    rc.turnOn();
    rc.turnOff();
  }
}
