package Layout_demo;


import javax.swing.*;
import java.awt.*;

import static javax.swing.SpringLayout.*;

/*
*    使用BorderLayout管理器的时候注意的地方:
*     1、在没有特指将组件放在某个位置的时候，默认放在中间区域
*     2、如果向同一个地方添加多个组件，后面的添加的组件将会覆盖掉前面的组件
*     两个构造器:
*      BorderLayout() :使用默认的水平间距，垂直的间距创建BorderLayout
*      BorderLayout() : 使用指定的水平间距，垂直的间距创建BorderLayout
* */
public class BorderLayout_test {

    public static void main(String[] args) {
        /*

        下面的代码构造了一个BorLayout类型管理器的窗口
        Frame f1 = new Frame("BorderLayout测试窗口");
        f1.setLayout(new BorderLayout(30,5));
        f1.add(new JButton("南"),SOUTH);
        f1.add(new JButton("北"),NORTH);
        f1.add(new JButton("东"),EAST);
        f1.add(new JButton("西"),WEST);
        f1.add(new JButton("中"));
        f1.setLocation(400,500);
        f1.pack();
        f1.setVisible(true);
         */

        /*因为BorderLayout也是一个容器,虽然只能添加物五个组件，但是
        可以先向panel添加多个组件，再将panel当作一个组件添加到BordeLayout容器里面，
        这样实现BorderLayout容器中的组件远远超过五个,下面的代码可以实现
         */
        Frame f = new Frame("Panel跟BorderLayout组合使用");
        f.setLayout(new BorderLayout(30,5));
        f.add(new JButton("南"),SOUTH);
        f.add(new JButton("北"),NORTH);
        Panel p = new Panel();
        p.add(new TextField(20));
        p.add(new JButton("点击我"));
        f.add(p);
        f.add(new JButton("东"),EAST);
        f.add(new JButton("东"),WEST);
        f.pack();
        f.setVisible(true);
    }
}
