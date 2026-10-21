package ex02;

public class DriverExample {

    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Tax tax = new Tax();

        Vehicle v1 = (Vehicle) bus;

        driver.drive(bus);
        driver.drive(tax);


    }
}
