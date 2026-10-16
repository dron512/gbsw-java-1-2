public class Ex03 {

    public static void main(String[] args) {
//        Phone phone = new Phone() ; // 추상클래스는 객체 생성 불가

        TelePhone telePhone = new TelePhone("홍길동");
        telePhone.turnOn();
        telePhone.autoAnswering();
        telePhone.turnOff();

        System.out.println();

        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
