package demo2;

public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println(getName()+"吃骨头");
    }
}
