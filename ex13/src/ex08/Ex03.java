package ex08;

interface AA {
    void doA();
}
public class Ex03 {
    public static void main(String[] args) {
        AA aa = () -> {
            System.out.println("음...");
        };
        aa.doA();
    }
}
