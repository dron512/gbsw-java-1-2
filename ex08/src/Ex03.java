//import kyk.BB;
//import BB;

public class Ex03 {

    // class 대문자
    // 패키지명, 변수명, 메서드명 소문자

    public static void main(String[] args) {

        BB bb = new BB();
        kyk.BB b = new kyk.BB();
        // public 다른 디렉토리 참조 가능
        // default 같은 디렉토리 참조 가능
        // protected 상속 참조가능
        // private 자기자신클래스에서만 참조가능
        System.out.println(b.kykaa);
        System.out.println(b.kykbb);

    }

}
