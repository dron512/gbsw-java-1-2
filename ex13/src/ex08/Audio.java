package ex08;

public class Audio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
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
