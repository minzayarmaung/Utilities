package OOP.Abstract;

abstract class Shape{
   public abstract double area(); // No need Body 
}
class Circle extends Shape{
    private double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {                  // Must Implement 
        // TODO Auto-generated method stub
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return width*length;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.area());

        Rectangle r = new Rectangle(5, 5);
        System.out.println(r.area());

    }
}
