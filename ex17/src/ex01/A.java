package ex01;

/*
 인터페이스
변수
 public static final로 선언
메서드
 몸체가 없는 메서드로 선언해야한다.
 */
// 모든 변수나 메서드는 메모리상에 올려놓고
// 사용해야합니다.
class AA implements A{
    // 클래스 필드(멤버변수)
    int AA = 10;
    @Override
    public void doA() {
        System.out.println("AA doA");
    }
}
public interface A {
    // 인터페이스 필드(멤버변수)
    int AA = 10;
    void doA();
    static void doB(){
        System.out.println("doB");
    }
    default void doC(){
        System.out.println("doC");
    }
}
