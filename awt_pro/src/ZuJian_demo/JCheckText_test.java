package ZuJian_demo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JCheckText_test {
    public static void main(String[] args) {
        Frame f = new Frame("测试");
        f.setSize(200,100);
        f.setLocation(300,400);
        f.setVisible(true);

        Panel p = new Panel();
        JCheckBox jCheckBox1 = new JCheckBox("111");
        JCheckBox jCheckBox2 = new JCheckBox("112");
        JCheckBox jCheckBox3 = new JCheckBox("113");
        JCheckBox jCheckBox4 = new JCheckBox("114");
        JCheckBox jCheckBox5 = new JCheckBox("115");
        JCheckBox jCheckBox6 = new JCheckBox("116");

        jCheckBox1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JCheckBox jCheckBox = (JCheckBox) e.getSource();
                System.out.println(jCheckBox.getText() + "是否选中" +jCheckBox.isSelected());
            }
        });

        jCheckBox1.setSelected(true);
        p.add(jCheckBox1);
        p.add(jCheckBox2);
        p.add(jCheckBox3);
        p.add(jCheckBox4);
        p.add(jCheckBox5);
        p.add(jCheckBox6);

        f.add(p);

    }
}
