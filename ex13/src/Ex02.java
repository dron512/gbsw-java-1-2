class AA{
    public void doMethod(){
        System.out.println("doMethod");
    }
}
class BB extends AA{
    public void doBBMethod(){
        System.out.println("doBBMethod");
    }
}
class CC extends AA{
    public void doCCMethod(){
        System.out.println("doCCMethod");
    }
}
public class Ex02 {
    public static void main(String[] args) {
        // 다형성 = 부모 참조 변수로 자식 객체를 참조할 수 있다.
        AA bb = new BB();
        bb.doMethod();
        ((BB)bb).doBBMethod();
        System.out.println(bb instanceof BB);

        AA cc = new CC();
        cc.doMethod();
        ((CC)cc).doCCMethod();
        System.out.println(cc instanceof CC);



    }
}
