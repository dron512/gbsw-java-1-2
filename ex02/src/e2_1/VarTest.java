package e2_1;

public class VarTest {
    static void main(String[] args) {
        int a = 0b1011;
        int b = 034;
        int c = 123;
        int d = 0xA1;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);

        byte e = (byte) 128;   //에러
    }
}
