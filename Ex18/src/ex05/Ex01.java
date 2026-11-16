package ex05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex01 extends JFrame {
  JButton jButton1 = new JButton("버튼111111");
  JButton jButton2 = new JButton("버튼222222");
  Ex01(){
    setLayout(new FlowLayout());
    jButton1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("버튼 1111111");
      }
    });
    jButton2.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("버튼 2222222");
      }
    }  );
    add(jButton1);  add(jButton2);

    setSize(600,500);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args) {
    new Ex01();
  }
}
