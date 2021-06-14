package demo1;
/*
接口不能实例化，因此要通过多态的方式实例化子类对象
接口的子类，可以是普通类也可也是抽象类，如果子类是抽象类，不用重写方法，否则得重写成员方法
接口的继承，接口也能继承与被继承，接口存在多个继承，比如接口1 extends 接口2，接口3，接口4.。。。。
继承就是“is a"的关系，实现是”like a "的关系，接口中定义的是扩展类功能。
 */
public class Test {
    public static void main(String[] args) {
       // Smoking smoking1 = new Smoking() 错误创建方式
        //使用多态去创建
        Smoking smoking = new Teacher();
        smoking.smoke();
    }
}
