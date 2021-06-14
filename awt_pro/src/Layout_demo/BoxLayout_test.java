package Layout_demo;

import javax.swing.*;
import java.awt.*;

public class BoxLayout_test {
    private Frame f = new Frame();
    public void init(){
        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
        f.add(new JButton("第一个按钮"));
        f.add(new JButton("第二个按钮"));
        f.pack();
        f.setVisible(true);
    }


    public static void main(String[] args) {
        new BoxLayout_test().init();
    }
}
