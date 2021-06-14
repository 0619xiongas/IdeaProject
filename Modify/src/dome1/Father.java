package dome1;
//测试四大权限修饰符；
public class Father {
    private void show1(){
        System.out.println("show private");
    }
    void show2(){
        System.out.println("show 默认");
    }
    protected void show3(){
        System.out.println("show protected");
    }
    public void show4(){
        System.out.println("show public");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.show1();
        father.show2();
        father.show3();
        father.show4();
    }
}
