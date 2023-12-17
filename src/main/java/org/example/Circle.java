package org.example;

public class Circle extends Shape{
    private int x1;
    private int y1;
    private int radius;

    public Circle(int x1, int y1, int radius) {
        this.x1 = x1;
        this.y1 = y1;
        this.radius = radius;
        getArea();
        getPerimeter();
    }

    @Override
    protected void getArea() {
        this.area = 3.14*radius*radius;
    }

    @Override
    protected void getPerimeter() {
        this.perimeter = 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
