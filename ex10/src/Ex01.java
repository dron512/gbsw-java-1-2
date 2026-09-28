public class Ex01 {
    public static void main(String[] args) {
        BB bb = new BB();

        System.out.println(bb.aa);
        bb.doA();
        System.out.println(bb.bb);
        bb.doB();

        CC cc = new CC();
        System.out.println(cc.aa);
        cc.doA();

        System.out.println(cc);
    }
}
