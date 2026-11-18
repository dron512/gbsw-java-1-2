package ex02;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Ex01 {
  public static void doA(Click 익명받는객체){
    익명받는객체.doClick();
  }
  public static void main(String[] args) {
    Click 익명구현객체 = new Click() {
      @Override
      public void doClick() {
        System.out.println("Clicked!");
      }
    };
    Click 람다객체 = ()->{
      System.out.println("Clicked!");
      System.out.println("여러줄 표현가능");
      System.out.println("여러줄 표현가능");
    };
    doA(람다객체);

    // Functional Interface
    // 자바 4가지 기본인터페이스
    // Consumer, Supplier, Function, Predicate
    // 소비자, 공급자, 함수, 조건
    // 싱글추상메서드라고 인터페이스 이미 구현되어져 있다.
    Consumer consumer = (a)->{
      System.out.println(a + "여러줄 표현가능");
    };
    consumer.accept("보내는거 ");

    Supplier<String> supplier = ()->{
      return "공급하는거";
    };
    String test = supplier.get();
    System.out.println(test);

    Stream.of(1,2,3,4,5)
        .forEach(
            (a)-> {
              System.out.println(a);
            }
        );
  }
}
