package TestDome3;

import javax.swing.*;
import java.awt.*;

public class test2 extends JFrame {
    JPanel p;
    JScrollPane scrollPane;
    private Container container;
    public test2(){
        this.setTitle("欢迎来到图书管理系统");
        container = this.getContentPane();
        container.setLayout(new BorderLayout());
        scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        p = new JPanel();
        scrollPane.setViewportView(p);
        p.add(new JButton("one"));
        p.add(new JButton("two"));
        p.add(new JButton("three"));
        p.add(new JButton("four"));
        p.add(new JButton("five"));
        container.add(scrollPane);
        container.add(new JButton("six"),BorderLayout.SOUTH);
        this.setVisible(true);
        this.setSize(400,300);
    }

    public static void main(String[] args) {
        new test2();
    }
}
