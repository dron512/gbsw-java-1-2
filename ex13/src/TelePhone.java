public class TelePhone extends Phone{
    public TelePhone(String owner) {
        super(owner);
    }

    @Override
    public void sound() {
        System.out.println("띠리띠리???");
    }

    public void autoAnswering(){
        System.out.println("자동응답 합니다.");
    }

    @Override
    public String toString() {
        return "TelePhone{ 재정의 되었ㄷ ㅏ ...}";
    }
}
