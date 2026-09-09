import calcu.Calculate;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        // 두수를 입력받아 Calculate 안에 있는 메서드를 사용해서 4칙 연산을 하세요..

        // 다른 패키지 안에 있으면 import 해야 합니다.
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("숫자 입력");
        int num2 = Integer.parseInt(sc.nextLine());

        // 한번 해보세요
        Calculate cal = new Calculate();
        cal.add(num1, num2);
        cal.sub(num1, num2);
        cal.mul(num1, num2);
        cal.div(num1, num2);
    }
}
