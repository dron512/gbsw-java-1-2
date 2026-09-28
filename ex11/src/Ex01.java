import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {
        // 1반 3교시 2반 6교시 수요일마다..
        // 다음주 수요일 클래스 배열..

        // 2차원배열
        int arr[][] = {
            {100,80,70,95},
            {95,20},
            {100,29,50}
        };
        // 1. 배열의 요소 출력하기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+"\t");
                total += arr[i][j];
            }
            System.out.println((i+1)+"번째 행 총점 = "+total);
            System.out.print((i+1)+"번째 행 평균 = ");
            System.out.printf("%.2f\n",(double)total/arr[i].length);
        }
        // 갯수를 담을 변수 선언
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] >= 60)
                    count++;
            }
        }
//        System.out.println();
        System.out.println("count = "+count);


    }

}
