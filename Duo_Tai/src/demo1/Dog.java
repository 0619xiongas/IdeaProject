package demo1;
//是Animal的子类
public class Dog extends Animal{
    //优化父类的方法

    @Override
    public void eat() {
        System.out.println(getName()+"吃骨头");
    }
}
