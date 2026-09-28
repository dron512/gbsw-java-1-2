public class BB extends AA{
    int bb=20;
    void doB(){
        System.out.println("doB");
    }
    // 기본생성자...??
    public BB(){
//        super();
        this(10);
        System.out.println("BB");
    }
    public BB(int a){
        System.out.println("BB(int)");
    }
}
