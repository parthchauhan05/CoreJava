public class A5Q1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 3);
        System.out.println("Rectangle's Perimeter: " + rect.getPerimeter());
        System.out.println("Rectangle's Area: " + rect.getArea());
        rect.resize(2);
        System.out.println("Rectangle's Perimeter: " + rect.getPerimeter());
        System.out.println("Rectangle's Area: " + rect.getArea());

        RtTriangle rtt = new RtTriangle(2, 3);
        System.out.println("Triangle's Perimeter: " + rtt.getPerimeter());
        System.out.println("Triangle's Area: " + rtt.getArea());

        Circle c = new Circle(5);
        System.out.println("Circle's Perimeter: " + c.getPerimeter());
        System.out.println("Circle's Area: "+ c.getArea());

    }
}

abstract class Shape {
    private int numSides;
    public Shape() {}

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

interface Resizable {
    public void resize(double x);
}

class Rectangle extends Shape implements Resizable {
    private double width, height;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public void resize(double x) {
        this.width *= x;
        this.height *= x;
    }
    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2*this.height + 2*this.width;
    }
}

class RtTriangle extends Shape {
    private double base, height;

    public RtTriangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return this.base * this.height * 0.5;
    }

    public double getPerimeter() {
        return this.height + this.base + Math.sqrt(this.height*this.height + this.base*this.base);
    }
}

class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        super(360);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}