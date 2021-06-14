package Lambda;

/**
 * 是可推导，可以省略
 * 凡是根据上下文推到出来的内容，都可以省略书写
 * 可以省略的内容：
 *     1，参数列表 括号中参数列表的数据类型，可以不写
 *     2 括号中的参数只有一个，那么类型跟()都可以不写
 *     如果{}中的代码只有一行，无论是否有返回值，都可以省略({},return,分号)
 *        要省略要三个一起省略
 */

public class LambdaTest {
    public static void main(String[] args) {
        RunnableImpl r1 = new RunnableImpl();
        Thread t = new Thread(r1);
        t.start();

        //使用匿名内部类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建了一个线程");
            }
        };
        new Thread(r).start();

        //继续简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建了一个新线程");
            }
        }).start();

        //使用Lambda表达式
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"使用Lambda表达式创建的线程")).start();


    }
}
