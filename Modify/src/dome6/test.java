package dome6;


public class test {
    public static void main(String[] args) {
        //定义一个字符串
        String str1 = "abc";
        //getByets 方法
        byte[] bys = str1.getBytes();
        for(int i=0;i < bys.length;i++){
            System.out.println(bys[i]);
        }
        System.out.println("-----------------------------------------------------");
        //toCharArray方法
        char[] ch1 = str1.toCharArray();
        for(int i =0 ;i<ch1.length;i++){
            System.out.println(ch1[i]);
        }
        System.out.println("---------------------------------------------------------");
        //valueOf方法,把1234转换成字符串1234
        String s2 = String.valueOf(1234);
        System.out.println(s2+5);//实际开发中，一般用以下字符串
        String s3 = "" + 1234;
        System.out.println(s3);
        System.out.println("---------------------------------------------------------");
        //repalce方法
        String s4 = "abc abc abc";
        //用d替换b
        String s5 = s4.replace('b','d');
        System.out.println(s5);
        System.out.println("---------------------------------------------------------");
        //split方法
        //将S4按照空格切割
        String[] arr = s4.split(" ");
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("---------------------------------------------------------");
        //trim方法
        String s6 = " a b c ";
        System.out.println("s6: "+s6);
        String s7 = s6.trim();
        System.out.println("s7: "+s7);
    }
}
