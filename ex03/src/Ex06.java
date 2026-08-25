import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
//        Animal a1 = new Animal();
        // nextLine 을 사용하세요...
        Scanner in = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력: ");
        String a = in.nextLine();
        System.out.println("두번쨰 숫자 입력: ");
        String b = in.nextLine();
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));


    }
}
