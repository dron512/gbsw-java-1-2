public class People {
    String name;
    String ssn;
    // 다른생성자 선언시 기본생성자 생략불가
    public People(){
        System.out.println("People");
    }
    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
