package ZuJian_demo;

import javax.swing.*;
import java.awt.*;

/*
     FileDialog是Dialog的一个子类 用于打开或者保存文件
* */
public class FileDialog_test {
    Frame f = new Frame();
    FileDialog fd1 = new FileDialog(f,"需要打开文件",FileDialog.LOAD);
    FileDialog fd2 = new FileDialog(f,"选择保存文件的路径",FileDialog.SAVE);

    JButton jb1 = new JButton("打开文件");
    JButton jb2 = new JButton("保存文件");

    public void init(){
        jb1.addActionListener(e ->
        {
            fd1.setVisible(true);
            System.out.println(fd1.getDirectory() + fd1.getFile());
        });
        jb2.addActionListener(e ->
        {
            fd1.setVisible(true);
            System.out.println(fd2.getDirectory() + fd2.getFile());
        });
        f.add(jb1);
        f.add(jb2,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new FileDialog_test().init();
    }
}
