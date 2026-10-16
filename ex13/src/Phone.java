public abstract class Phone {
    private String owner;
    // command + n constructor
    public Phone(String owner) {
        this.owner = owner;
    }

    public abstract void sound();

    public void turnOn(){
        System.out.println("핸드폰 전원 On");
    }
    public void turnOff(){
        System.out.println("핸드폰 전원 Off");
    }
}
