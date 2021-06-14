package demo3;

public class test {
    public static void main(String[] args) {
        reverse r1 = new reverse();
        reverse r2 = new reverse();
        System.out.println(r1.num);
        System.out.println(r2.num);
        int []a = {1,6,9,4,6,3};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.print("\n");
        reverse.res(a);
        System.out.println("----------");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
