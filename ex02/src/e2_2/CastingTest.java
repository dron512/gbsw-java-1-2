package e2_2;

public class CastingTest {

    static void main(String[] args) {
        byte a = 127;
        int b = a;  // 자동형변환

        int c = 128;
        byte d = (byte) c;  // 강제형변환

        System.out.println("b = "+b);
        System.out.println("d = "+d);
    }

}
