package demo2;

public interface USB {
    //成员常量
    int I = 10;
    //jdk 1.7之前的写法
    public abstract void open();

    public abstract void close ();

    //jdk 1.8的写法
    public  static  void method1(){
        System.out.println("jdk1.8static 特性");
    }
    public default void method2(){
        System.out.println("jdk 1.8default 特性");
    }
   /* //jdk 1.9
    private void method3(){
        System.out.println("jdk  1.9 特性");
    }*/

    //没有构造方法
    //public USB(){}


}
