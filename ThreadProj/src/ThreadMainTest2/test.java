package ThreadMainTest2;

/**
 * 使用Thread中的sleep方法，使当前的线程以指定的毫秒数暂停
 */
public class test {
    public static void main(String[] args) {
        for(int i=1;i<=60;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);//1000ms = 1s
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
