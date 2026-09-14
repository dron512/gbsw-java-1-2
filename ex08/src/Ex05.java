import classes.Car;

public class Ex05 {

    /*
        1. 객체 생성시에는
            클래스 설계도 작성 -> 생성자 호출
        2. 생성자 호출은
            생성자 오버로딩 여러개를 작성가능하다.
            해당되는 생성자가 호출된다.
        3. 오버라이드라고 해서
            toString을 정의 하게 되면 주소값 출력이 아니라
            return 되어서 돌아오는 문자열이 출력된다.
        4. 생성자 호출시에 필드값 초기화 가능
     */

    public static void main(String[] args) {

        Car car1 = new Car(10);

        // toString()은 재정의하게 되면
        // 주소값 출력이 아니라
        // return 되어서 돌아오는 String이 출력됩니다.
        System.out.println(car1.toString());
    }

}
