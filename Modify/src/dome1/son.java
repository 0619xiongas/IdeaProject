package dome1;

public class son extends Father {
    public static void main(String[] args) {
        Father father = new Father();
        //father.show1();
        father.show2();
        father.show3();
        father.show4();
        son s = new son();
        s.show2();;
        s.show3();
        s.show4();
    }
}
