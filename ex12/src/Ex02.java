public class Ex02 {

    public static void main(String[] args) {
        AA b1 = new BB();
        AA c1 = new CC();
        // 부모타입으로 자식객체 참조가능하다 ... 다형성..

        // BB 배열은 BB만 담을수 있다.
        BB bbr[] = new BB[10];
        bbr[0] = new BB();
//        bbr[0] = new AA();
        // CC 배열은 CC만 담을수 있다.
        CC ccr[] = new CC[10];
        ccr[0] = new CC();
//        ccr[0] = new AA();

        // AA BB CC 도 담을수 있는 배열이 만들어집니다.
        AA aar[] = new AA[10];
        aar[0] = new BB();
        aar[0] = new AA();
        aar[0] = new CC();

        aar[0].print();

        System.out.println( aar[0] instanceof BB);
        System.out.println( aar[0] instanceof CC);

        if (aar[0] instanceof CC){
            ( (CC) aar[0] ).printCC();
        }

//        ( (BB) aar[0] ).printBB();
//        ( (CC) aar[0] ).printCC();
    }

}
