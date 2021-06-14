package demo3;


public class reverse {
    int num = 10;
    static int num1 = 20;
    public static void show(){
        System.out.println(num1);
    //    System.out.println(num);静态方法中只能访问静态变量
    }
    public static void res (int[] arr){
        for (int i=0;i < arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}

