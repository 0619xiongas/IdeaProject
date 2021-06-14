package ZuJian_demo;

import javax.swing.*;
import java.awt.*;

public class RadioButton_test {
    public static void main(String[] args) {
        Frame f = new Frame("测试");
        f.setSize(200,300);
        f.setLocation(400,300);
        Panel p = new Panel();
        JRadioButton b1 = new JRadioButton("男");
        JRadioButton b2 = new JRadioButton("女");

        ButtonGroup gb = new ButtonGroup();
        gb.add(b1);
        gb.add(b2);

        b1.setSelected(true);
        p.add(b1);
        p.add(b2);

        f.add(p);
        f.setVisible(true);
    }
}
