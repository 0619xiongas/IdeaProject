package TestDome1.apple;

public class Apple {
    private int price;

    private String color;

    public void show(){
        System.out.println("这个苹果的颜色是"+getColor()+"色"+"价格是"+getPrice()+"元一斤");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Apple(int price, String color) {
        this.price = price;
        this.color = color;
    }
}
