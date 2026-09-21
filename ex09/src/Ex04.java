public class Ex04 {
    // instance 멤버
    int a = 10;
    void doA(){ System.out.println("Do A"); }

    // stiatc 멤버
    static int b = 20;
    static void doB(){ System.out.println("Do B"); }

    // static(정적) 메서드
    // static -> static 호출 가능하다.
    public static void main(String[] args) {
        Ex04 ex04 = new Ex04();
        System.out.println(ex04.a);
        System.out.println(ex04.b);
        ex04.doA();
        ex04.doB();

        ex04.b = 100;
        System.out.println(Ex04.b);

        // static ... 프로그램 시작시 항상 존재..
        // 끝날때까지.. 메모리영역에 있습니다.
        // new 힙 영역에 할당 되어 지는데...
        /*
            A a = new A();
            a = null;
         */

    }

}
