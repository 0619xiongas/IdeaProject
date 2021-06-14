package demo2;

/*
    接口中没有变量，只有常量，因为所以的量都是public abstract final，因此没变量
    成员方法是public abstract，jdk1.8后，有默认方法和静态方法，分别用public default和static修饰。jdk1.9之后，有私有方法，用private修饰
    接口中没有构造方法
 */

public class Test {
    public static void main(String[] args) {
        //USB.i = 20; 错误写法，接口中的量是常量
        System.out.println(USB.I);
    }
}
 