package jihu;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        System.out.println(add(1,2));
    }
    public static int add(int a,int b){
        try{
            return a+b;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("ok");
        }
        return 0;
    }
}
