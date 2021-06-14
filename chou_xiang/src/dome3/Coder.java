package dome3;

public class Coder extends Employee{

    //子类的空参构造访问父类的空参构造
    //子类的全参构造访问父类的全参构造


    public Coder() {
    }

    public Coder(String name, double salary, String id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("程序员要敲代码");
    }
}
