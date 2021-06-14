package ThreadMainTest;

/**
 * getName ，获取当前线程的名称
 * setName 设置线程的名字
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
    } //获取当前线程名称
    public MyThread(){

    }
    public MyThread(String name){
        super(name);
    }
}
