package runableTest;

/**
 * 在一个类中创建Runnable接口的实现类
 * 重写run方法
 * 创建一个runnable接口的实现类对象
 * 创建Thread的对象，构造方法中传递Runnable接口的实现类对象
 * 调用Thread类中的start方法，开启心的线程
 */
public class Runableimp implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
