package ex01;
public class Car {
    public Tire frontTire = new HankookTire();
    public Tire backTire = new KumhoTire();
    public void run(){
        frontTire.roll();
        backTire.roll();
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.frontTire = new KumhoTire();
        car.backTire = new HankookTire();
        car.run();
    }
}
