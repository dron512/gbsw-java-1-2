import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;

        int[] arr = {10,20,30};
        int[] brr= arr;

        a = 50;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        arr[0] = 50;
        System.out.println("arr "+ Arrays.toString(arr));
        System.out.println("brr "+ Arrays.toString(brr));
    }
}
