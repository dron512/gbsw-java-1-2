package ex01;

public class Ex02 {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void doA() {
                System.out.println("A doA");
            }
        };
        A a1 = ()->{
            System.out.println("화살표 doA");
        };
        a.doA();
        a1.doA();
    }
}
