package demo1;

public class Test {
    public static void main(String[] args) {

        /* 演示多态
        1要有继承
        2要有方法的重写
        3要有父类引用指向子类
         */

        //多态
        Animal a = new Dog();//父类引用指向子类
        a.setName("哈士奇");
        a.eat();
    }
}
