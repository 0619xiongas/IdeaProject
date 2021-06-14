package Layout_demo;

import javax.swing.*;
import java.awt.*;

public class NULL_test {
    Frame f = new Frame("测试窗口");
    JButton jb1 = new JButton("按钮1");
    JButton jb2 = new JButton("按钮2");
    public void init(){
        f.setLayout(null);
        jb1.setBounds(20,30,90,28);
        f.add(jb1);
        jb2.setBounds(50,45,120,35);
        f.add(jb2);
        f.setBounds(50,50,200,100);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new NULL_test().init();
    }

}
