package eshop_client;

/**
 * 客户端顶层父类，用于被继承
 * 处理公共用户操作
 */
public class Client {
    /** 全局 用户操作登录  */
    public static final String LOGIN = "L";
    /** 全局 用户操作  上一次操作记录*/
    public  static final String HISTORY = "I";
    /** 全局 用户操作  首页*/
    public  static final String INDEX = "I";

    public static void main(String[] args) {
        Client c = new Client();
        c.start();
    }
    public void start(){
        UserClient uc = new UserClient();
        String result = uc.showLogin();
        if(result.equals(INDEX)){
            System.out.println("这里是首页");
        }else if(result.equals(LOGIN)){
            System.out.println("这里是登录界面");
        }else if(result.equals(HISTORY)){
            System.out.println("这里是历史界面");
        }else{
            System.out.println("出错了");
        }
    }
}
