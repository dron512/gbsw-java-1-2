package e2_1;

public class LocalTest {
    public static void f1(){
        int c = 30;
        System.out.println("c = "+c);
    }
    public static void f2(){
        int b = 20;
        System.out.println("b = "+b);
    }
    static void main() {
        int a = 10;
        System.out.println("a = "+a);
        f1();
        f2();
    }
}
