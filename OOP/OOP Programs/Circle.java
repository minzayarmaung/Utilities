package OOP_Practise;

public class Circle {
   private double radius =1.0;
   private String color = "red";

public Circle(double radius,String color){
    this.radius = radius;
    this.color = color;
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Circle c = new Circle(2, "Blue");
        c.getColor();
        c.getRadius();

        System.out.println(c.getColor() + c.getRadius());
    }
}
