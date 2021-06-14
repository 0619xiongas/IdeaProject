package eshop_client;


import eshop_common.entity.Msg;
import eshop_common.util.JSONUtil;
import eshop_user.UserAction;

import java.util.Scanner;

/**
 *
 * 用户操作界面，所有与用户操作相关的内容，都放到这个类里面
 */
public class UserClient extends Client{
    /**
     * 用户登录操作页面
     * 1 使用控制台提示用户输入用户名、密码
     * 2 向服务器发送请求，并返回消息字符串
     * 使用sette把数据传递给Action
     * 使用Action的登录功能
     * 3.解析字符串，提示用户信息
     * 4，页面跳转：使用字符串常量作为跳转标记
     * 成功：返回上一次操作界面
     * 失败： 返回登录界面
     * @return
     */
    public String showLogin() {
        //1 输入用户名跟密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名: ");
        String userName = sc.nextLine();
        System.out.println("请输入您的密码: ");
        String passWord = sc.nextLine();

        //2，发送请求
        UserAction userAction = new UserAction();
        userAction.setUsername(userName);
        userAction.setPassword(passWord);

        //调用Action里面的方法，实现登录
        String result = userAction.login();

        //解析消息对象，提示用户信息
        Msg msg = JSONUtil.JSON2Entity(result, Msg.class);
        if (msg.getType().equals(Msg.SUCCESS)){
            System.out.println(msg.getMsg());
            return HISTORY;//返回到上一个操作界面
        }else {
            System.out.println(msg.getMsg());
            return LOGIN;//回到登录界面
        }
    }
}
