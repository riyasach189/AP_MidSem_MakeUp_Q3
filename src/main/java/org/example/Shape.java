package org.example;

public abstract class Shape {
    protected double perimeter;
    protected double area;

    protected abstract void getArea();
    protected abstract void getPerimeter();

    public double returnPerimeter()
    {
        return this.perimeter;
    }

    public double returnArea()
    {
        return this.area;
    }
}
