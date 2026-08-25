public class Ex08 {

    public static void main(String[] args) {
//        String a = 1+"";
        String a = String.valueOf(1.03);
        System.out.println("a="+a);
        /*
            next.js -> typescript
            정수형
            byte short int long 19
            실수형
            float double 3.14
            논리형
            boolean true false
            자동형변환... byte-> int 작은거에서 큰거 넣을때
            강제형변환... int -> byte 큰거에서 작은거 넣을때
            String -> int 형변환 Integer.parseInt();
         */
        byte v = 10;
        int x = v;  // 자동형변환

        int m = 200;
        byte p = (byte) m; // 강제형변환
    }

}
