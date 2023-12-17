package org.example;

public class Quadrilateral extends Triangle{

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;


    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, x2, y1, y2, x3, y3);
        this.x4 = x4;
        this.y4 = y4;
        getPerimeter();
        getArea();
    }

    @Override
    protected void getArea() {
        double area1;
        double area2;

        double len1 = calculateDistance(x1, y1, x2, y2);
        double len2 = calculateDistance(x2, y2, x3, y3);
        double len3 = calculateDistance(x3, y3, x4, y4);
        double len4 = calculateDistance(x4, y4, x1, y1);

        double len5 = calculateDistance(x3, y3, x1, y1);

        double s1 = (len1+len2+len5)/2;
        double s2 = (len3+len4+len5)/2;

        area1 = Math.sqrt(s1*(s1-len1)*(s1-len2)*(s1-len5));
        area2 = Math.sqrt(s2*(s2-len3)*(s2-len4)*(s2-len5));

        this.area = area1+area2;
    }

    @Override
    protected void getPerimeter() {
        double len1 = calculateDistance(x1, y1, x2, y2);
        double len2 = calculateDistance(x2, y2, x3, y3);
        double len3 = calculateDistance(x3, y3, x4, y4);
        double len4 = calculateDistance(x4, y4, x1, y1);

        this.perimeter = len1+len2+len3+len4;
    }

    @Override
    public String toString() {
        return "Quadrilateral";
    }
}