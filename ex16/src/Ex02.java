import javax.swing.*;
import java.awt.*;

public class Ex02 extends JFrame {
    Ex02(){
        JButton btn = new JButton("버튼1");
        btn.addActionListener(e->{
            System.out.println("메시지를 받습니다.");
        });
        this.add(btn, BorderLayout.CENTER);
        this.setSize(300, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ex02");
    }
    public static void main(String[] args) {
        new Ex02();
    }
}
