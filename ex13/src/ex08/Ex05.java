package ex08;

public class Ex05 {

    public static void main(String[] args) {
        Ex04 ex04 = new Ex04();
        ex04.rc.turnOn();
        ex04.rc.setVolumn(5);
        ex04.rc.turnOff();

        new Ex04(new Television());
        ex04.method1();
        ex04.method2(new Audio());
    }

}
