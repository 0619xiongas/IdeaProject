package SolutionTest_ThreadSafe;

/**
 * 使用同步代码块
 *   格式：
 *      synchronized(锁对象){
 *          可能会出现线程安全的问题
 *           或者访问了共享数据代码
 *      }
 *      必须保证多个线程使用的锁对象是同一个
 *      锁对象可以是任意的对象
 *         作用：
 *             把同步代码锁住，只让一个线程在同步代码中运行
 */
public class Runnableimpl1 implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    Object obj = new Object();
    @Override
    public void run() {

        while(true) {
            synchronized (obj){
                //提高安全问题的出现的概率，让程序睡眠10ms
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "票");
                    ticket--;
                }
            }
        }
    }
}