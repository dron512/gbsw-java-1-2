public class SmartPhone extends Phone{
    public SmartPhone(String owner) {
        super(owner);
    }

    @Override
    public void sound() {
        System.out.println("스마트스마트??");
    }

    public void internetSearch(){
        System.out.println("인터넷 검색 합니다.");
    }
}
