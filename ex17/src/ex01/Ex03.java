package ex01;

public class Ex03 {
    public static void main(String[] args) {
        A.doB();
//        A.doC(); // 에러...
        AA aa = new AA();
        aa.doC();
        // default예약어는 객체 선언해서
        // 인스턴스화 해야 사용가능
        // 인스턴스화 정의
        // 스택이랑 힙영역에 메모리에 할당한다
    }
}
