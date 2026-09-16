import classes.Car;

public class Ex06 {

    /*
        Ex07.java Student.java 파일 생성하고
        Ex07에서 main 메서드 생성해서..
        Student - name,age,gender 필드 만들고
        학생 3명을 만들고
        Student 객체 생성해서
        {"홍길동",20,"남자}
        {"김길동",25,"여자}
        {"박길동",30,"남자}
        출력... (toString()) 이용해서 출력..
     */

    public static void main(String[] args) {
        // 3개 자동차를 만들어서
        // 모델명, 색상, 최고속도를 넣어서 소스 작성

        Car car1 = new Car("K5","RED",200);
        System.out.println(car1);
//        car1.model = "K5";
//        car1.color = "Red";
//        car1.maxSpeed = 200;
//        System.out.println(car1);

    }
}
