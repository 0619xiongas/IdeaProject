package ThreadMainTest3;


/**
 * 匿名内部类方式实现线程的创建
 *   简化代码
 *     把子类继承父类，重写父类中的方法，创建子类对象合一步完成
 *     把实现类实现类接口，重写接口中的方法，创建实现类对象合一步完成
 *
 *     格式
 *         new 父类(){
 *             重复父类/接口中的方法
 *         }
 */
public class Test {
    public static void main(String[] args) {
        //线程的父类是Thread类,重写run方法
        new Thread(){
            @Override
            public void run(){
                for(int i=0;i<20;i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }.start();

        //线程的接口Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 20; j++) {
                    System.out.println(Thread.currentThread().getName() + "coder" + j);
                }
            }
        };

        new Thread(runnable).start();

    }
}
