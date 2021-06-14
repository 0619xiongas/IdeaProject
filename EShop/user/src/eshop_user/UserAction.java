package eshop_user;

import eshop_common.action.BaseAction;
import eshop_common.entity.Msg;
import eshop_common.util.JSONUtil;
import eshop_entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * 用户控制器类
 * 处理所有用户，并返回JSON格式的字符串消息
 */
public class UserAction extends BaseAction {
    //用户名
    private String username;
    //用户名密码
    private String password;

    /**
     * 用户的登录功能
     * 1.封装数据到User对象
     * 2.调用UserService处理逻辑
     *   抛出异常
     * 3.异常处理
     * 4，根据服务层返回结果生成消息
     * 5.记录日志
     * 6.响应消息到客户端
     * @return 返回
     */
    public String login(){
        Msg msg = new Msg();
        try {
            //封装数据到User对象
            User user = new User();
            user.setUserName(username);
            user.setPassWord(password);

            //调用UserService处理逻辑
            UserService userService = new UserServiceImpl(); //多态的使用
            user = userService.login(user); //如果返回null，则user跟前面的user无关
            //异常处理 try catch

            // 根据服务层返回结果生成消息，消息实体类Msg
            if(user != null) {
                msg.setType(Msg.SUCCESS); // 登录成功
                msg.setMsg("登录成功");
            }else{
                msg.setType(Msg.FALL); // 登录失败
                msg.setMsg("用户名或密码不正确");
            }

            return JSONUtil.entity2JSON(msg);
        }catch (Exception e){
            e.printStackTrace();
            msg.setType(Msg.FALL); // 登录失败
            msg.setMsg("服务器异常");
            return JSONUtil.entity2JSON(msg);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
