class AA{
    int a = 10;
    int b = 20;
}
public class Ex01 {
    public static void main(String[] args) {

        AA a1 = new AA();
        AA a2 = new AA();

        AA a3 = a1;
        System.out.println(a1.a);
        System.out.println(a3.a);
        a1.a = 30; // 값 변경
        System.out.println(a1.a);
        System.out.println(a3.a);

        System.out.println("a2.a");
        System.out.println(a2.a);

//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);


    }
}
