package TestDome1;


import TestDome1.apple.Apple;
import  java.lang.Math;
public class Test {
    public static void main(String[] args)throws Exception {
        Person p = new Person("mark",10,"boy");
        System.out.println(p.getAge()+ "  " +p.getName());
        System.out.println("-------------------------------");
        Object p1 = p.getClass().newInstance();
        System.out.println(p1.toString());
    }

    public static int  triple(int x){
        x = 3*x;
        return x;
    }
    public static int max(int... a){
        Integer i = Integer.MIN_VALUE;
        for(int o:a){
            if(o>i) i = o;
        }
        return i;
    }
}