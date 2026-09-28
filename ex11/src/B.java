public class B {
    public void method(){
        A a = new A();
        System.out.println(a.a);
        a.doA();
    }
    public static void main(String[] args) {
//        B.method();
        B b = new B();
        b.method();
    }
}
