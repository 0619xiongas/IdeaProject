package dome7;


// 子类
public class NineYin extends Martial{
    @Override
    public void internalStrength(){
        super.internalStrength();//调用父类成员方法
        System.out.println("以柔克刚");
    }
    @Override
    public void stroke(){
        super.stroke();//调用父类中的方法
        System.out.println("九阴白骨爪");//重写了父类中的stroke
    }
}
