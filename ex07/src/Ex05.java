import cont.Car;

public class Ex05 {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println(c1.company);
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.maxSpeed);

        c1.company = "현대";
        c1.model = "쏘나타";
        c1.color = "흰색";
        c1.maxSpeed = 100;

        System.out.println(c1.company);
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.maxSpeed);


//        String companies[] = new String[5];
//        String models[] = new String[5];
//        int maxSpeeds[] = new int[5];

//        cont.Car arr[] = new cont.Car[5];

    }
}
