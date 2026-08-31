public class Ex01 {
    public static void main(String[] args) {
        /*
            2장 type 자료형 타입
            기본형타입
            정수 - byte short int long
            실수 - float double
            문자형 - char
            논리 - boolean

            참조형타입
            String , int[], float[] 여러배열
            Object

            int -> double
            double -> int
            int -> byte

            String -> int Integer.parseInt
            String -> double Double.parseDouble

            int -> String
            3장 연산자
            증가대입 i = 1;
            // 1증가 시키는 방법
            i += 1 ;
            i++;
            ( ) 연산자 우선순위 제일 높다...

         */
        double a = 10.55;
        int b = (int) a;

        int c = 129;
        byte d = (byte) c;

        System.out.println(d);

        int k = (10 + 2) * 3;

        int aa = 10;
        int bb = 20;
        System.out.println(aa > bb ? aa : bb);

    }
}
