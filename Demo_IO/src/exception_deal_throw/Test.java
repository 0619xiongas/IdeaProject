package exception_deal_throw;

//抛出异常，交给代码执行者处理
/*
执行结束后，程序不再执行
 */
public class Test {
    public static void main(String[] args) throws Exception{
        try {
            show();
        }catch (Exception e){
            System.out.println("出现问题");
        }
        System.out.println("okkk");
    }
    public static void show() throws Exception{
        int a = 10 / 0;
        System.out.println("a: "+a);
    }
}
