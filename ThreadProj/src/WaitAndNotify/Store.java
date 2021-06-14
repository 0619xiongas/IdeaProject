package WaitAndNotify;

import java.util.TreeMap;

/**
 * 一个线程类，继承于Thread类
 * 对包子的状态进行判断
 * 要使用同步技术保证线程只能一个在执行
 * 把包子对象作为锁对象
 */
public class Store  extends Thread{
    private Bun b1;

    public Store(Bun b1){
        this.b1 = b1;
    }
    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (b1) {
                if (b1.flag == true) {
                    try {
                        b1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    b1.pi = "薄皮";
                    b1.xian = "三鲜";
                } else {
                    b1.pi = "冰皮";
                    b1.xian = "牛肉";
                }
                count++;
                System.out.println("店铺正在生成：" + b1.pi + b1.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                b1.flag = true;
                b1.notify();
                System.out.println("店铺生产好了" + b1.pi + b1.xian + "包子，可以开吃了");

            }
        }
    }
}
