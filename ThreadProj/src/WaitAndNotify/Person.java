package WaitAndNotify;

public class Person extends  Thread{
    private Bun b2;

    public Person(Bun b2){
        this.b2 = b2;
    }
    @Override
    public void run(){
        while(true){
            synchronized (b2){
                if(b2.flag == false){
                    try {
                        b2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("正在吃包子"+b2.pi+b2.xian+"包子");
                b2.flag = false;
                b2.notify();
                System.out.println("已经吃完了包子"+b2.pi+b2.xian);
                System.out.println("-------------------------------");
            }
        }
    }

}
