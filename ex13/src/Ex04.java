public class Ex04 {

    public static void main(String[] args) {

        TelePhone tp1 = new TelePhone("홍길동");
        System.out.println(tp1);

        tp1.turnOn();
        tp1.sound();
        tp1.autoAnswering();
        tp1.turnOff();


    }

}
