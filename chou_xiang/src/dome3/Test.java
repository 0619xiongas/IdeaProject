package dome3;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        //测试coder
        Employee employee1 = new Coder();
        employee1.work();
        Employee employee2 = new Manager();
        employee2.work();
        System.out.println("-------------------------");
        //快速实例化
        Employee coder = new Coder("张三",30000.0,"计科一班06");
        System.out.println(coder.getId());
        System.out.println(coder.getName());
        System.out.println(coder.getSalary());
        System.out.println("-------------------------");

        Manager manager = new Manager("李四",40000,"研发部001",100000);
        System.out.println(manager.getSalary());
        System.out.println(manager.getId());
        System.out.println(manager.getName());
        System.out.println(manager.getBonus());
    }
}
