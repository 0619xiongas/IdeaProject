package eshop_entity;

public class User extends Person {
    private String userName;

    private String passWord;

    private String role = "NORMAL"; //普通用户



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
