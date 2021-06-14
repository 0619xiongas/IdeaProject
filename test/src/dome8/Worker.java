package dome8;

public class Worker extends Person {
    public Worker(){
        super("xiong");//系统默认的代码，而且必须写在子类的第一行
        System.out.println("我是Worker类的空参构造");
    }
}
