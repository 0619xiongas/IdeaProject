package Layout_demo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* CardLayout 布局管理器，将组件看成一叠卡片，每次只有最上面的那个Component才可见。
   两个构造器:
         CardLayout() : 创建默认的CradLayout构造器
         CardLayout(int hgap,int vgap): 通过指定卡片与容器左右边界的间距hgap，上下间距vgap来创建CardLayout布局管理器

* */
public class CardLayout_test {
        Frame f = new Frame("测试窗口");
        String[] names = {"第一张", "第二张", "第三张", "第四张", "第五张"};
        Panel p1 = new Panel();
        public void init(){
            final CardLayout c = new CardLayout();
            p1.setLayout(c);
            for(int i = 0;i< names.length;i++){
                p1.add(names[i],new JButton(names[i]));
            }
            Panel  p = new Panel();
            ActionListener al  = e ->{
                switch (e.getActionCommand()){
                    case "上一张":
                        c.previous(p1);
                        break;
                    case"下一张":
                        c.next(p1);
                        break;
                    case"第一张":
                        c.first(p1);
                        break;
                    case"最后一张":
                        c.last(p1);
                        break;
                    case"第三张":
                        c.show(p1,"第三张");
                        break;
                }
            };
            JButton pervious = new JButton("上一张");
            pervious.addActionListener(al);

            JButton next = new JButton("下一张");
            next.addActionListener(al);

            JButton first = new JButton("第一张");
            first.addActionListener(al);

            JButton last = new JButton("最后一张");
            last.addActionListener(al);

            JButton third = new JButton("第三张");
            third.addActionListener(al);
            p.add(pervious);
            p.add(next);
            p.add(first);
            p.add(last);
            p.add(third);
            f.add(p1);
            f.add(p,BorderLayout.SOUTH);
            f.pack();
            f.setVisible(true);
        }

    public static void main(String[] args) {
        new CardLayout_test().init();
    }
}
