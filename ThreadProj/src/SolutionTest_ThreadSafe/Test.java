package SolutionTest_ThreadSafe;

public class Test {
    public static void main(String[] args) {
        //方法一：同步代码块
/**       Runnableimpl1 r = new Runnableimpl1();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        //调用start方法
        t1.start();
        t2.start();
        t3.start();*/

        //同步方法
/**        Runnableimpl2 r = new Runnableimpl2();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        System.out.println(r);
        //调用start方法
        t1.start();
        t2.start();
        t3.start();*/

        //利用lock接口去实现

        Runnableimpl3 r = new Runnableimpl3();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        System.out.println(r);
        //调用start方法
        t1.start();
        t2.start();
        t3.start();

    }
}
