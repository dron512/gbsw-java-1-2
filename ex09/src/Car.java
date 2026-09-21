
// 스프링부트
//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
public class Car {
    // 공유변수 전역변수 static변수다.. -> 클래스명.AA
    // 인스턴스변수 -> new
    public static int AA = 10;
    public int BB = 20;
    Car(){
        Car.AA++;
    }
    private String model;
    private int speed;

    public String getModel(){
        return this.model;
    }
    public int getSpeed() {
        return speed;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
