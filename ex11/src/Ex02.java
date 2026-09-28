class AA{
    public int a = 10;
    public void doA(){
        System.out.println("AA doA method");
    }
}
class BB extends AA{
    public int a = 20;
//    @Override
    public void doA(){
        super.doA();
        System.out.println("BB doA method");
    }
}
public class Ex02 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb.a);
        bb.doA();
    }
}
