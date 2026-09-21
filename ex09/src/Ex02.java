public class Ex02 {

    public static void main(String[] args) {

        // AA 변수는 static 있고...
        // BB 변수는 static 없습니다.

        System.out.println(Car.AA);
//        System.out.println(Car.BB);

        Car c1 = new Car("쏘나타", 100);
        System.out.println(c1.BB);
    }

}
