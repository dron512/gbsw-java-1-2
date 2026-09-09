//import java.lang.String;
// 자바 생략가능한 문법...
// import java.lang.*;

import calcu.Calculate;
import calcu.AA;

// 계산기...
public class Ex02 {

    public static void main(String[] args) {
        AA a = new AA();
        // 객체화...
        Calculate c = new Calculate();
        c.add(1, 2);
//        Calculate c2 = "없음 안됨";

//        String
        String aa = new String("aa있음");
        String bb = "bb있음";
        System.out.println(aa.equals(bb));


    }
}
