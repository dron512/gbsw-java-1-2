public class Ex01 {
    public static void main(String[] args) {
/*
    private 변수들은..
    command + n
    1. 생성자
    2. setter ,getter  설정하기, 가져오기
    3. toString()
 */
        Car car1 = new Car("쏘나타",100);
        // 참조가능..
        // public default protected private
//        car1.model = "쏘나타";
//        car1.speed = 100;
//        car1.model = "쏘나타3";
        car1.setModel("쏘나타3");
        car1.setSpeed(200);
// 1차 수행평가
//  - 1차원배열 - 2차원배열 - 객체배열
        System.out.println(car1);
        System.out.println(car1.getModel());
        System.out.println(car1.getSpeed());
    }
}
