package classes;

public class Car {
    public String model;
    public String color;
    public int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
//        return this; // 자동 생성
    }
    //오버라이드...재정의...
    @Override
    public String toString() {
        int a = 10; // toString 함수 종료시에 변수가 메모리에서 삭제 됩니다.
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    // 기본생성자는 자동생성되어져 있다..
//    public Car(){}
    public Car(){
        System.out.println("기본생성자");
        return; // 자동생성되어져있다..
    }
    // 생성자 오버로딩 문법..
    // 생성자는 여러개를 만들수 있는데 파라메터가 달라야 한다.
    public Car(int a){
        System.out.println(a);
        System.out.println("다른생성자");
    }

}
