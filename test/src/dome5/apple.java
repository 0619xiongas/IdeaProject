package dome5;

public class apple extends Fruit {
    int price = 10;
    public void showPrice(){
       int price = 5;
        System.out.println(price);
        System.out.println(this.price);
        System.out.println(super.price);
    }
}
