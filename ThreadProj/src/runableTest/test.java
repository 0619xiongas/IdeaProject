package runableTest;

/**
 * 实现Runnable接口创建多线程的好处：
 * 1 避免了单继承的局限性
 *     因为一个类只能继承一个类，类继承了Thread类就不能继承其它的类了
 *     实现了Runnable接口还可以继承其它的类
 * 2 增强了程序的扩展性，降低了程序的耦合性
 *   使用接口增强了程序的可改性
 */
public class test {
    public static void main(String[] args) {
        Runableimp run = new Runableimp();
        Thread t = new Thread(run);
        t.start();

        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }

    }
}
