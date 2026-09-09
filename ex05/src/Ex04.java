import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int arr[] = {14, 22, 31, 40};

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        for (int temp : arr) {
            System.out.println(temp);
        }
    }
}
