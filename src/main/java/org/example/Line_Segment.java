package org.example;

public class Line_Segment extends Shape{
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Line_Segment(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        getArea();
        getPerimeter();
    }

    @Override
    protected void getArea() {
        this.area = 0;
    }

    @Override
    protected void getPerimeter() {
        this.perimeter = calculateDistance(x1, y1, x2, y2);
    }

    protected double calculateDistance(int x1, int y1, int x2, int y2)
    {
        double distance;
        distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        return distance;
    }

    @Override
    public String toString() {
        return "Line";
    }
}
