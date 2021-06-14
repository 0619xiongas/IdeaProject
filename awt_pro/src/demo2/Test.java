package demo2;


import javax.swing.*;
import java.awt.*;

public class Test {
    Frame f = new Frame("测试中心");
    JButton jb = new JButton("确认");
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox male = new Checkbox("男",cbg,true);
    Checkbox female = new Checkbox("女",cbg,false);
    Checkbox married = new Checkbox("是否已婚",false);
    Choice choice = new Choice();
    List list = new List(6,true);
    TextArea textArea = new TextArea(5,20);
    TextField name = new TextField(50);
    public void init(){
        choice.add("red");
        choice.add("blue");
        choice.add("green");
        list.add("red");
        list.add("blue");
        list.add("green");
        Panel p1 = new Panel();
        p1.add(name);
        p1.add(jb);
        f.add(p1,BorderLayout.SOUTH);
        Panel p2 = new Panel();
        p2.add(choice);
        p2.add(male);
        p2.add(female);
        p2.add(married);
        Box topl = Box.createVerticalBox();
        topl.add(textArea);
        topl.add(p2);
        Box top = Box.createHorizontalBox();
        top.add(topl);
        top.add(list);
        f.add(top);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Test().init();
    }
}
