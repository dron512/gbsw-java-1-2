package ex03;

public class Ano {
  // 필드 클래스 변수 선언
  Person p1 = new Person(){
    public void work(){
      System.out.println("운동합니다.");
    }
    public void wake(){
      System.out.println("8시에 일어납니다.");
      work();
    }
  };
  // 메서드 선언
  void method1(){
    Person p2 = new Person(){
      public void work(){
        System.out.println("산책합니다.");
      }
      public void wake(){
        System.out.println("6시에 일어납니다.");
        work();
      }
    };
    p2.wake();
  }

  void method2(Person p2){
    p2.wake();
  }
}
