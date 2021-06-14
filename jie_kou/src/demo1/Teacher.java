package demo1;

//接口的实现类

public class Teacher implements Smoking{
//重写方法
    @Override
    public void smoke() {
        System.out.println("抽烟有害健康!");
    }
}
