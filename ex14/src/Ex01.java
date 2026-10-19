import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) {
        // 크기가 10개인 정적 배열이라
        // 10개 이상을 넣을 수 없습니다.
        // 정적이라 크기 변경 X
        int ary[] = new int[10];

        // 컬렉션 a = []
        // a.add(10)
        // a.add(20)
        // a.add("한글");
        // 동적으로 크기 변경된다.
        List list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
//        System.out.println(a.length);

        // print(a[0])
        // 자바 컬렉션에서는 get으로 안에 내용을 가져올 수 있다.
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
