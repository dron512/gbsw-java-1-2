public class ChCalcu extends Calcu{
    // 오버로딩.. 생성자 오버로딩 메서드 오버로딩... 문제 나옵니다..
    @Override   // 재정의했다...
    public void doB(){
        System.out.println("재정의된 doB");
    }
    public void doC(){
        System.out.println("doC");
    }
    @Override
    public String toString() {
        return "ChCalcu{}";
    }
}
