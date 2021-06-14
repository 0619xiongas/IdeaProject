package exception_deal_try_catch_finally;

//异常处理
public class Test {
    public static void main(String[] args) {

        //try catch finally 方法 出现异常，跳到catch中的内容再执行finally，没有异常，则执行finally
        try {
            int a = 10;
            System.out.println("a :"+a);
        }catch (Exception e){
            System.out.println("被除数不能为0");
            return ;
        }finally { // 即使catch中有return finally里面的代码也能执行，因此finally里面的语句一般都是会执行的
            System.out.println("okkk！！");
        }
        System.out.println("okkk！！");

    }
}
