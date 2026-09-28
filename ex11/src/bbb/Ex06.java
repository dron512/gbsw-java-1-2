package bbb;

class A{}

class B extends A{}
class C extends B{}

class D extends A{}
class E extends D{}

public class Ex06 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = c;
//        B b2 = D;
    }
}
