package ThreadSafe;


/**
 * 模拟买票案例
 * 创建三个线程 同时开启，对共享的票进行出售
 */
public class test {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        /**
         * 以下代码14~21行编译运行之后，出现线程安全问题
         */
        Runnableimpl r = new Runnableimpl();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        //调用start方法
        t1.start();
        t2.start();
        t3.start();

    }
}
