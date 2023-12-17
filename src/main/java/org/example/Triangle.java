package org.example;

public class Triangle extends Line_Segment{

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int x3;
    private int y3;


    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, x2, y1, y2);
        this.x3 = x3;
        this.y3 = y3;
        getPerimeter();
        getArea();
    }

    @Override
    protected void getArea() {
        double len1 = calculateDistance(x1, y1, x2, y2);
        double len2 = calculateDistance(x2, y2, x3, y3);
        double len3 = calculateDistance(x3, y3, x1, y1);
        double s = (len1+len2+len3)/2;
        this.area = Math.sqrt(s*(s-len1)*(s-len2)*(s-len3));
    }

    @Override
    protected void getPerimeter() {
        double len1 = calculateDistance(x1, y1, x2, y2);
        double len2 = calculateDistance(x2, y2, x3, y3);
        double len3 = calculateDistance(x3, y3, x1, y1);

        this.perimeter = len1+len2+len3;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
