import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        // python -> input()
        // js -> require('readline');
        Scanner input = new Scanner(System.in);

//        System.out.println("숫자 입력");
//        int x = input.nextInt();
//        System.out.println("x = "+x);

        System.out.println("문자열 입력");
        String y = input.nextLine();
        System.out.println("y = " + y);
        // int k = (int) y;
        int k = Integer.parseInt( y );
        System.out.println(k + 200);
    }
    /*
        Scanner input = new Scanner(System.in);
        AI사용하지 마세요....
        두개의 숫자를 입력받아 두수의 합을 출력하시오....
     */
}
