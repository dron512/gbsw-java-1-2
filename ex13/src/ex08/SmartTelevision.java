package ex08;

public class SmartTelevision implements RemoteControl,Searchable{
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

    @Override
    public void search() {
        System.out.println("검색");
    }
}


