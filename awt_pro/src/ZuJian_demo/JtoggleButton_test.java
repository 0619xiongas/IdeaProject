package ZuJian_demo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JtoggleButton_test {
    public static void main(String[] args) {
        JFrame jf = new JFrame("测试");
        jf.setSize(200,300);
        jf.setLocation(200,400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        JToggleButton jToggleButton = new JToggleButton("开关按钮");
        jToggleButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JToggleButton jToggleButton1 = (JToggleButton) e.getSource();
                System.out.println(jToggleButton1.getText()+ "是否选择" + jToggleButton1.isSelected());
            }
        });

        jp.add(jToggleButton);
        jf.add(jp);
        jf.setVisible(true);

    }
}
