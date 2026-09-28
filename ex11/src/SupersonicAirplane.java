public class SupersonicAirplane extends Airplane{
    public static final int AA = 10;
    private int flymode = Constant.NORMAL;
    public void setFlymode(int flymode) {
        this.flymode = flymode;
    }
    @Override
    public void fly() {
        System.out.println(AA);
        System.out.println(SupersonicAirplane.AA);
        if(flymode==Constant.SUPERSONIC) {
            System.out.println("음속비행");
        }else {
            super.fly();
        }
    }
}
