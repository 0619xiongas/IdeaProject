package TestDome5;

import java.util.Objects;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color,double a,double b,double c){
        super(color);
        setSides(a,b,c);
    }

    private void setSides(double a, double b, double c) {
        if(a >= b + c || b >= a + c || c >= a + b){
            System.out.println("三角形两边之和必须大于第三边");
            return ;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return "三角形";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 && Double.compare(triangle.b, b) == 0 && Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
