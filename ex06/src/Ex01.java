import java.util.Scanner;

/*
  숫자를 입력받아 배열의 크기를 설정
  배열의 크기만큼 점수를 입력받아 출력
  1번 고보성
*/
public class Ex01 {
    public static void main(String[] args) {
        System.out.println("배열의 크기를 설정");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int arr[] = new int[num];

        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + "번째 입력:");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
