package SolutionTest_ThreadSafe;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 利用lock接口
 *  lock():获取锁
 *  unlock():释放锁
 *  Reentrantlock 实现类
 *
 *  使用步骤
 *      在成员位置创建一个reentrantlock对象
 *      在可能出现安全问题的代码前调用lock接口中的方法获取lock锁
 *      在可能出现安全问题的代码后调用方法释放lock锁
 */
public class Runnableimpl3 implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true) {
            lock.lock();
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
            lock.unlock();
        }
    }
}