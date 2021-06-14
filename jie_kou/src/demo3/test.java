package demo3;

public class test {
    public static void main(String[] args) {

        int a,b,h;
        for(h = 1;h<=4;h++){
            for(a = h;a<=4;a++){
                System.out.print(" ");
            }
            for(b=1;b<=2*h-1;b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
