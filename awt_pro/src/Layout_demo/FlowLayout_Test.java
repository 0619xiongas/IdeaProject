package Layout_demo;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_Test {
    public static void main(String[] args) {
        Frame f1 = new Frame("测试窗口");
       // f1.setSize(500,200); 这样设置容易看出flowLayout的特性,不过一般都是调用pack方法，自动设置成最佳的窗口大小
        f1.setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
        for(int i = 0;i< 10 ;i++){
            f1.add(new JButton("按钮 "+i));
        }
        f1.pack();
        f1.setVisible(true);
    }
}
