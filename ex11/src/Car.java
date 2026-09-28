public class Car {
    int speed=0;
    public void speedUp(){
        speed+=1;
    }
    public final void stop(){
        System.out.println("멈춤");
    }
}
