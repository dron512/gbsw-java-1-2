import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
//        arr[3] = 3;
        // 처음으로 선언할때는 모든 값이 할당 되지만
        // 선언후에 모든 값 할당이 되지 않는다.
        // python 과 javascript는 된다....
//        arr = {1,2,3};
    }

}
