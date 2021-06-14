package WaitAndNotify;

public class Test {
    public static void main(String[] args) {
        Bun bun = new Bun();

        // 开启店铺线程
        new Store(bun).start();

        //吃货线程
        new Person(bun).start();
    }
}
