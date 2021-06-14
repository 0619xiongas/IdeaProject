package Layout_demo;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SpringLayout.NORTH;

/*
    存在两个构造器:
    1、GridLayour(int rows,int cols): 采用指定的行数、列数，以及默认的横向及间距，纵向间距将容器分割成多个网格
    2、GridLayout(int rows,int cols,int hgap,int vgap): 采用指定的行数、列数，以及指定的横向及间距，纵向间距将容器分割成多个网格
* */
public class GridLayout_test {
    /*
    下面将结合BorderLayout和GridLayout实现一个计算器的窗
    frame 默认是BorLayout管理，代码中实际在BorderLayout中添加了两个容器：一个是p，在NORTH区域添加了一个文本框，一个是p1，在
    CENTER区域添加了一个Panle容器,采用的是GridLayout管理布局
    * */
    public static void main(String[] args) {
        Frame f = new Frame("计算器");
        Panel p = new Panel();
        p.add(new TextField(30));
        f.add(p,NORTH);
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3,5,4,4));
        String[] name = {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","."};
        for(int i = 0;i< name.length;i++){
            p2.add(new JButton(name[i]));
        }
        f.add(p2);
        f.pack();
        f.setVisible(true);
    }
}
