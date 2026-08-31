// 1차 수행평가 4번 제출..
// 수요일... 마지막 시간.. 6교시..
// 문제를...

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Scanner 사용하여 학생 이름 3명을 입력받아 같은 이름이 있는지 검사하시오
        // 검사하여 같은 이름이 있으면 같은 이름 있음 출력
        //                 없으면 같은 이름 없음 출력
//        String name1 = "";
//        String name2 = "";
//        String name3 = "";
        // 배열을 사용하시오..
        String[] arr = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.println(" 학생 이름을 입력하세요 : ");
        arr[0] = input.nextLine();
        System.out.println(" 학생 이름을 입력하세요 : ");
        arr[1] = input.nextLine();
        System.out.println(" 학생 이름을 입력하세요 : ");
        arr[2] = input.nextLine();

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);

        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    flag = false;
                }
            }
        }
        System.out.println(flag ? "이름 같지 않음" : "이름 같음");

    }
}
