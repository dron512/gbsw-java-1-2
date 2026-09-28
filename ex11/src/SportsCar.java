public class SportsCar extends Car{
    @Override
    public void speedUp(){ speed+=10; }
    // final 메서드라서 재정의 X
//    public void stop(){
//        System.out.println("스포츠카 멈춤");
//    }
}
