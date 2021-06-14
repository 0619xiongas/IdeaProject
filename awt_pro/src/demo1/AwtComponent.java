package demo1;

import javax.swing.*;
import java.awt.*;

public class AwtComponent {
    public static void main(String[] args) {
        Frame f1 = new Frame("测试窗口");
        f1.setSize(500,400);
        f1.setLocation(200,300);
        Panel p1 = new Panel();
        p1.add(new TextField(20));
        p1.add(new JButton("点击我"));
        f1.add(p1);
        f1.setVisible(true);
    }
}
