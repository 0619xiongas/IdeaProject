package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 当线程第一次启动时，创建多个线程，保存到一个集合中，
 * 当我们使用线程的时候，就可用从集合中取出来线程使用
 * jdk1.8 就自带线程池，不必创建集合了
 * Executors 线程池的工厂类
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        es.shutdown();
    }
}
