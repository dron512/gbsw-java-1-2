public class Ex03 {

    // 1차 4번 25%
    // 2차   25%
    // 3차   25%
    // 기말   25%
    public static void main(String[] args) {
        SupersonicAirplane
                sap = new SupersonicAirplane();
//        sap.flymode=2;
        sap.setFlymode(Constant.SUPERSONIC);
        sap.fly();

    }

}
