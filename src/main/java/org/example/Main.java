package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1, y1, x2, y2, x3, y3, x4, y4;

        System.out.println("Line:");
        System.out.print("x1:");
        x1 = scanner.nextInt();
        System.out.print("y1:");
        y1 = scanner.nextInt();
        System.out.print("x2:");
        x2 = scanner.nextInt();
        System.out.print("y2:");
        y2 = scanner.nextInt();

        Line_Segment line = new Line_Segment(x1, y1, x2, y2);

        System.out.println("Triangle:");
        System.out.print("x1:");
        x1 = scanner.nextInt();
        System.out.print("y1:");
        y1 = scanner.nextInt();
        System.out.print("x2:");
        x2 = scanner.nextInt();
        System.out.print("y2:");
        y2 = scanner.nextInt();
        System.out.print("x3:");
        x3 = scanner.nextInt();
        System.out.print("y3:");
        y3 = scanner.nextInt();

        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);

        System.out.println("Quadrilateral:");
        System.out.print("x1:");
        x1 = scanner.nextInt();
        System.out.print("y1:");
        y1 = scanner.nextInt();
        System.out.print("x2:");
        x2 = scanner.nextInt();
        System.out.print("y2:");
        y2 = scanner.nextInt();
        System.out.print("x3:");
        x3 = scanner.nextInt();
        System.out.print("y3:");
        y3 = scanner.nextInt();
        System.out.print("x4:");
        x4 = scanner.nextInt();
        System.out.print("y4:");
        y4 = scanner.nextInt();

        Quadrilateral quad = new Quadrilateral(x1, y1, x2, y2, x3, y3, x4, y4);

        System.out.println("Circle:");
        System.out.print("x1:");
        x1 = scanner.nextInt();
        System.out.print("y1:");
        y1 = scanner.nextInt();
        System.out.print("Radius:");
        x2 = scanner.nextInt();

        Circle circle = new Circle(x1, y1, x2);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(line);
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(quad);

        PerimeterComparator pc = new PerimeterComparator();
        AreaComparator ac = new AreaComparator();

        shapes.sort(pc);

        System.out.println("Acc to perimeter:");

        for (Shape shape: shapes)
        {
            System.out.println(shape);
        }

        shapes.sort(ac);

        System.out.println("Acc to area:");

        for (Shape shape: shapes)
        {
            System.out.println(shape);
        }
    }
}