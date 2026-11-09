class CallListener implements Button.OnClickListener{
    @Override
    public void onClick() {
        System.out.println("전화를 받습니다.");
    }
}
public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener( new CallListener() );
        button.touch();
        button.setOnClickListener( ()-> {
            System.out.println("메시지를 받습니다.");
        } );
        button.touch();
    }
}
