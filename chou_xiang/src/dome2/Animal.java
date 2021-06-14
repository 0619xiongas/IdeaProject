package dome2;

/*
1、抽象类有普通的成员变量，也可也有成员常量
2、可以有抽象方法，也可以有非抽象方法
3、有构造方法，并且构造方法还可以重载
 */

//抽象类中的成员比普通类中多一种：抽象方法,其它与普通方法一样
public abstract class Animal {

    String name = "哈士奇";

    final int AGE = 30;
    public abstract void eat();

    public abstract void sleep();

    public  void call(){
        System.out.println("动物叫");
    }
}
