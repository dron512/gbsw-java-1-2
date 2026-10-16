package ex08;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        // 부모타입으로 자식 객체를 참조 할 수 있다. 다형성 개념
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.setVolumn(5);
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search();

//        searchable.turnOn(); // turnOn은 RemoteControl로로만 호출 가능...
                                // Searchable 이기 때문에 에러...

    }
}
