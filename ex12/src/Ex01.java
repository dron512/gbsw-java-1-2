// 2차원..배열..
public class Ex01 {
    public static void main(String[] args) {
        int arr[][] = {
                {100, 90, 20, 30},
                {60, 90, 100, 20},
                {50, 70, 80, 90}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total = arr[i][j]+total;
            }
            System.out.println("total "+total);
            System.out.println("avg "+total/arr[i].length);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j]>=60)
                    count++;
            }
        }
        System.out.println("60점 이상인 개수 "+count);
    }
}
// 1반 채하늬 황석현 2반 최시훈 정영준 고보성