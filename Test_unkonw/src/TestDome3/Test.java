package TestDome3;


import javax.swing.*;
import java.awt.*;

public class Test extends JFrame{
    public  Test(){
        this.setTitle("欢迎来到洪山172 "); //标题
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setBackground(Color.RED);
        JButton bt = new JButton("press me !");
        p.add(bt);
        c.add(p,BorderLayout.WEST);
        this.setVisible(true); // 使得窗口显示出来
        this.setSize(1000,300); //窗口的大小

    }

    public static void main(String[] args) {
        new Test();
    }
}
