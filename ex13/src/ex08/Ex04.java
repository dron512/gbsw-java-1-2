package ex08;

public class Ex04 {
    // 필드
    RemoteControl rc = new Television();

    Ex04(){}
    // 생성자
    Ex04(RemoteControl rc){
        this.rc = rc;
        this.rc.turnOn();
        this.rc.setVolumn(7);
        this.rc.turnOff();
    }

    // 메서드 로벌변수
    public void method1(){
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolumn(3);
        rc.turnOff();
    }

    // 메서드 매개변수로 사용하는방법
    public void method2(RemoteControl rc){
        rc.turnOn();
        rc.setVolumn(4);
        rc.turnOff();
    }

}
