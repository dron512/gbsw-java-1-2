package ex08;

public class Ex02 {
    public static void main(String[] args) {
        // 부모 인터페이스로 자식 구현객체를 참조,호출가능하다
        // 부모 클래스로 자식 구현객체 참조,호출가능하다
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
