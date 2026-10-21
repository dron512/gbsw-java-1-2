package ex02;

public class Driver {
    public void drive(Vehicle vehicle) {

        if ( vehicle instanceof Bus ){
            Bus temp1 = (Bus) vehicle;
            System.out.println("버스형타입");
        }else if (vehicle instanceof Tax){
            Tax temp2 = (Tax) vehicle;
            System.out.println("택시형타입");
        }

        vehicle.run();
    }
}
