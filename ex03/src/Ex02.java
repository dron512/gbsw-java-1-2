public class Ex02 {

    public static void main(String[] args) {

        // byte 변수 2개 선언하고 두개의 더한 값을 출력하는데
        // byte 타입에 넣어서 출력.

        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);   //complie Error
        System.out.println("c = " + c);

        // 자바는 정수형 계산을 할때 int 형계산을 하는 특성
        //      실수형 계산을 할때는 double형 계산을 하는 특성

        // 빠른 에러 처리는 해당하는 곳 커서에 가서 option enter
        float d = (float) (10.0 + 20.3);
        System.out.println("d = " + d);
//        int c = 127836182736128376128376;

        char q = 'A';
        System.out.println(q);
        System.out.println((int) q);

        System.out.println((char) 66);

        int e = q + 10;
        System.out.println(e);
        System.out.println((char) e);

        int w = 10;
        int h = 4;
        System.out.println(w / h);
        System.out.println(w / (double) h);

    }
}
