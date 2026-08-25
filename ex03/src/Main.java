/*
    type A = {
        aa:number,
        bb:number
    }
    const a:A = {
        aa:10,
        bb:20
    }
*/
public class Main {
    public static void doA() {
        System.out.println("DoA");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        doA();

//        String a = "문자열";
//  3.12345 -> 3.12 로 바꾸어서 출력해달라 (형변환만 사용)
        double a = 3.12345 * 100;
        int b = (int) a;  // 에러가 됩니다...

        System.out.println("b = " + b / (double) 100);

    }
}