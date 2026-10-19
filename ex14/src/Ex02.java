import java.util.ArrayList;
import java.util.List;

public class Ex02 {

    public static void main(String[] args) {
        // 배열
        AA ary[] = new AA[10];
        // 리스트
        List<AA> list = new ArrayList<>();

        list.add(new AA());
        System.out.println(list.get(0));

        AA a2 = new AA();
        a2.a = 10;
        a2.b = 20;
        a2.c = "값할당";

        list.add(a2);
        System.out.println(list.get(1));

        AA a3 = new AA(40,50,"모든필드생성자");
        list.add(a3);
        System.out.println(list.get(2));

    }

}
