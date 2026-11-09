package ex01;

public class Ex01 {

    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(aa.AA);
        aa.doA();

        // 인터페이스에 메서드는 구현을 하게 되면
        // 호출 가능하다
        A a = new A(){
            @Override
            public void doA() {
                System.out.println("A doA");
            }
        };
        a.doA();
        System.out.println(A.AA);
// final 변경 불가...
//        A.AA = 20;
    }
}
