package aaa;

// 클래스...
// public default protected private
// private 선언한것은 생성자와 setter getter
// static -> 메모리에 바로 올라간다.. 프로그램종료시에 삭제된다.
// public 모든곳에서 호출 가능하나.. 메모리에 할당되어야된다..
// defulat 같은 패키지 내에서 참조가능
// protected 상속관계에서 참조가능
// private 자기자신 클래스에서만 참조가능
// final -> 변수... 상수화
//       -> 메서드 ... 재정의 불가
//       -> 클래스 ... 상속불가...



public class C {
    protected int aa = 10;
    protected void doA(){
        System.out.println("C.doA");
    }
}
