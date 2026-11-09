public class A {
    class B{
        int field1;
        void method1(){
//            static int field2; // 에러 발생...
            System.out.println("A B method1");
        }
    }
    static class D{
        int field2;
        public void methodD()
        {
            System.out.println("A D methodD");
        }
    }
    public void method2(){
        B b = new B();
        b.method1();
        System.out.println(b.field1);
    }
    public void method3(){
        class C{}
    }
}
