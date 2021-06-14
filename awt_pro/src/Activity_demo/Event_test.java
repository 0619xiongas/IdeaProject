package Activity_demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    简单的演示AWT的事件流程图

* */
public class Event_test {
    private Frame f = new Frame("测试");
    private JButton jb = new JButton("确定");
    private TextField tf = new TextField(30);

    public void init()
    {
        // 注册事件监听器
        jb.addActionListener(new OkListener());
        f.add(tf);
        f.add(jb,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }
    class OkListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
            System.out.println("用户单击了确定按钮");
            tf.setText("你好！");
        }
    }

    public static void main(String[] args) {
        new Event_test().init();
    }
}
