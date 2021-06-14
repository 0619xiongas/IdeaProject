package Layout_demo;

import javax.swing.*;
import java.awt.*;

public class GridBagLayout_test {
    /*
       此布局管理器功能最强大，但也最为复杂
       为了处理GridBagLayout中GUI组件的大小，跨越性，java
       提供了GridBagConstraints对象，该对象与特定的GUI组件关联，用于控制改GUI组件的大小，跨越性

        1、创建GirdBagLayout布局管理器 并指定GUI容器值用该布局管理器。
        GridBagLayout gb = new GridBagLayout();
        container.setLayout(gb);
        2、创建GridBagConstraints对象，并设置该对象的相关属性
        gbc.gridx = 2; 设置受该对控制的GUI组件位于网格的横向索引
        gbc.gridy = 1; 设置受该对控制的GUI组件位于网格的纵向索引
        gbc.gridwidth ; 设置受该对控制的GUI组件横向跨域多少网格
        gbc.gridheight ; 设置受该对控制的GUI组件纵向跨域多少网格
        3、调用GridBagLayout对象的方法来建立 GridBagConstraints对象和受控制组件之间的关联
        gb.setConstraints(c,gbc) ;设置c组件受gbc对象控制
        4、添加组件 与采用普通布局管理器添加组件的方式一样
        container.add(c);

    * */

    //下面列子示范了如何用GridBagLayout布局管理器来管理窗口中的10个按钮
    public static void main(String[] args) {
        new GridBagTest().init();
    }
    public static class GridBagTest{
        private Frame f = new Frame("测试窗口");
        private GridBagLayout gb = new GridBagLayout();
        private GridBagConstraints gbc = new GridBagConstraints();
        private JButton[] bs = new JButton[10];
        public void init(){
            f.setLayout(gb);
            for(int i = 0;i<bs.length;i++){
                bs[i] = new JButton("按钮"+i);
            }
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1;
            addJButton(bs[0]);
            addJButton(bs[1]);
            addJButton(bs[2]);
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            addJButton(bs[3]);
            gbc.weightx = 0;
            addJButton(bs[4]);
            gbc.gridwidth = 2;
            addJButton(bs[5]);
            gbc.gridwidth = 1;
            gbc.gridheight = 2;
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            addJButton(bs[6]);
            gbc.gridwidth = 1;
            gbc.gridheight = 2;
            addJButton(bs[7]);
            gbc.weighty = 0;
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.gridheight = 1;
            addJButton(bs[8]);
            addJButton(bs[9]);
            f.pack();
            f.setVisible(true);
        }

        private void addJButton(JButton jButton) {
            gb.setConstraints(jButton,gbc);
            f.add(jButton);
        }
    }
}
