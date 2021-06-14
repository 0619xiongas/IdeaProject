package dome5;

public class test {
    public static void main(String[] args) {
        String str = "我与杀戮之中绽放,亦如黎明中的花朵！";

        //int Length方法
        System.out.println("len :"+str.length());
        //char charAt方法
        char ch = str.charAt(3);
        System.out.println(ch);
        //indexOf方法
        System.out.println("index1: "+str.indexOf("中"));
        //lastIndexOf方法
        System.out.println("index2: "+str.lastIndexOf("中"));
        //substring方法
        String str1 = str.substring(9);
        System.out.println("str1: "+str1);
        String str2 = str.substring(4,14);
        System.out.println("str2: "+str2);
    }
}
