public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        // B클래스를 static으로 선언
//        A.B b1 = new A.B();

        // a 인스턴스 생성후 B 클래스 생성
        A.B b2 = a.new B();
        System.out.println(b2.field1);
        b2.method1();

        A.D d = new A.D();
        d.field2 = 10;
        d.methodD();
    }
}
