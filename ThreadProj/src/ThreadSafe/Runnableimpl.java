package ThreadSafe;


/**
   实现买票案例
 */
public class Runnableimpl implements Runnable{
    /**
     定义一个多个线程共享的票源
     */
    private int ticket = 100;

    @Override
    public void run() {
        while(true) {
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
