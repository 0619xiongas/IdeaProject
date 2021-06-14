package dome4;

public class test {
    public static void main(String[] args) {
        //构造方法
        // 1. 将指定的字符数组转换成字符串
        byte [] bys = {97,98,99};
        String s = new String(bys);
        System.out.println("s: " +s);

        //2. 将指定的字符数组转换成字符串
        char[] chars = {'h','e','l','l','o'};
        String s2 = new String(chars);
        System.out.println("s2: "+s2);
        String s3 = "sldfnklasjl";
        System.out.println("s3: "+s3);
        System.out.println("----------------------------");
        //成员方法
        String str1 = "abc";
        String str2 = "ABC";
        boolean b1 = str1.equals(str2);
        System.out.println("equals: "+b1);
        boolean b2 = str1.equalsIgnoreCase(str2);
        System.out.println(b2);
        boolean b3 = str1.startsWith("abc");
        System.out.println(b3);
        String str3 = "";
        boolean b4 = str1.isEmpty();
        boolean b5 = str3.isEmpty();
        System.out.println(b4);
        System.out.println(b5);
    }
}
