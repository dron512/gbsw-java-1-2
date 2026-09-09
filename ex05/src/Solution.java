class AA {
}

class BB {
}

//public class BB{}
public class Solution {
    public int solution(int left, int right) {
        int sum = 0; // 총합
        for (int i = left; i <= right; i++) {
            System.out.println("i = " + i);
            int count = 0; // 약수 개수
            for (int j = 1; j <= i; j++) {
                System.out.print("j = " + j + " ");
                if (i % j == 0) {
                    count++;
                }
            }
            if (count%2==0) {
                sum += i;
            }else{
                sum -= i;
            }
            System.out.println();
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
//        Solution s = new Solution();
//        s.solution(13, 17);
        new Solution().solution(13, 17);
    }
}