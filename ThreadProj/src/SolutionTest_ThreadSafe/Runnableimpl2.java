package SolutionTest_ThreadSafe;

/**
 * 使用同步方法
 *     把访问了共享数据的代码抽取出来，放到一个方法中
 *     在方法上添加synchronized修饰符
 * 格式 定义方法的格式
 *      修饰符synchronized 返回值 方法名(参数列表)
 *      {
 *          代码
 *      }
 */
public class Runnableimpl2 implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    @Override
    public void run() {
        System.out.println(this);
        while (true) {
            //定义一个同步方法
            payTicket();
        }
    }
    public synchronized void payTicket(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "票");
            ticket--;
        }
    }
}