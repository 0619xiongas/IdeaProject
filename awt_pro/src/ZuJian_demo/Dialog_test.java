package ZuJian_demo;


import javax.swing.*;
import java.awt.*;

/*    对话框组件
     是windows类的子类，可以独立存在的窗口，使用注意两点
     1、依赖于其他窗口，通常有一个父类窗口parent窗口
     2、存在两种模式，当其中一种模式被打开，该模式对话框总是位于依赖它的窗口的之上，在模式对话被关闭之前，它依赖的窗口无法获得焦点
     3、存在多个重载的构造器，但是其构造器的参数可能是以下三个参数：
       owner: 指定该对话框所依赖的窗口，既可以是窗口也可以是对话框
       title: 指定该对话框的窗口标题
       modal: 指定该对话框是否是模式的，可以是true 或者 false

* */
public class Dialog_test {
    Frame f = new Frame("测试");
    Dialog d1 = new Dialog(f,"模式对话框",true);
    Dialog d2 = new Dialog(f,"非模式对话框",false);

    JButton jb1 = new JButton("打开模式对话框");
    JButton jb2 = new JButton("打开非模式对话框");

    public void init(){
        d1.setBounds(20,30,300,400);
        d2.setBounds(20,30,300,400);
        jb1.addActionListener(e -> d1.setVisible(true));
        jb2.addActionListener(e -> d2.setVisible(true));
        f.add(jb1);
        f.add(jb2,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Dialog_test().init();
    }
}
