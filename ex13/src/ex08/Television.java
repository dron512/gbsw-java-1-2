package ex08;

// 인터페이스를 상속받게 되면 메서드 오버라이드 해야한다.
public class Television implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("텔레비전을 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("텔레비전을 끕니다.");
    }
    @Override
    public void setVolumn(int volume) {
        if (volume > RemoteControl.MAX_VOLUME)
            this.volume = RemoteControl.MAX_VOLUME;
        else if ( volume < RemoteControl.MIN_VOLUME)
            this.volume = RemoteControl.MAX_VOLUME;
        else
            this.volume = volume;
        System.out.println("불륨설정 "+ this.volume);
    }
}
