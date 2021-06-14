package Login;

import java.awt.*;
import javax.swing.*;
public class Login {


    public static void main(String[] args) {

        JPanel jPanel = null;
        JButton login = null;
        JButton cancel = null;
        JButton register = null;
        JLabel jl = null;
        JTextField loginText = null;
        JTextField pwdText = null;
        //基础界面设计
        JFrame jf = new JFrame("登录");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,377,264);
        jf.setLocation(450,260);

        //向jpanel里面添加组件
        JPanel jp = new JPanel();
        jp.setBorder(UIManager.getBorder("ScrollPane.border"));
        GridBagLayout gbl = new GridBagLayout();
        jp.setLayout(gbl);


        JLabel jl1 = new JLabel("用户: ");
        jl1.setFont(new Font("华文仿宋",Font.BOLD,14));
        jl1.setVerticalAlignment(SwingConstants.TOP);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0,0,5,5);
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 3;
        gbc.gridy = 2;

        loginText = new JTextField();
        loginText.setColumns(10);
        loginText.setFont(new Font("华文仿宋",Font.BOLD,14));
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.fill = GridBagConstraints.HORIZONTAL;
        gbc1.insets = new Insets(0,0,5,5);
        gbc1.anchor = GridBagConstraints.NORTHWEST;
        gbc1.gridx = 4;
        gbc1.gridy = 2;
        gbc1.gridwidth = 4;
        jp.add(jl1,gbc);
        jp.add(loginText,gbc1);
        jf.add(jp);
        jf.setVisible(true);
    }
}
