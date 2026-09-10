package cont;

public class Student {
    // 필드
    public String name;
    public int age;
    // 생성자
    // 생략 가능한 문법...
    // import java.lang.*;
    // 기본생성자는 있어도 되고
    // 없어도 되지만 만약에 작성하게 되면
    // 원래 있던 기본생성자는 없어지고
    // 내가 작성한 기본생성자가 실행된다.
    public Student(){
        System.out.println("기본생성 ");
    }
    public Student(String name){}
    // 메서드들
    public void methodName1(){}
    public void methodName2(){}
    public void methodName3(){}
    public void methodName4(){}
}
