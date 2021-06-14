package ThreadMainTest;

/**
 * 创建多线程的方式一： 创建Thread类的子类，在其子类中重写其run方法，设置线程任务，创建其子类的对象，调用Thread类中的start方法
 * 开启心的线程，执行run方法
 *
 */
public class test1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("小强");
        myThread.start();

        MyThread mt1 = new MyThread("wangc");
        mt1.start();
    }
}
