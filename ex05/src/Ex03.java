import java.util.Arrays;

public class Ex03 {
    // 2차원 배열 출력
    public static void doPrintArr(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void main(String[] args) {
//        int arr[][] = new int[5][5];
        int arr[][] = { {1, 2, 3},
                        {4, 5},
                        {6, 7, 8, 9},
                        {10},
                        {11, 12, 13, 14, 15, 16} };
        doPrintArr(arr);
        System.out.println();
        int temp[] = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        doPrintArr(arr);
    }
}
