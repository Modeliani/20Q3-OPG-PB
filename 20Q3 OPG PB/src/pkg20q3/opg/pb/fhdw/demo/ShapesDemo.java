
package pkg20q3.opg.pb.fhdw.demo;

import shapes.*;

public class ShapesDemo {
    public static void main(String[] args){
        Point point = new Point();
        printShape(point);
        Line line = new Line(3.0);
        printShape(line);
        Rectangle ranctagle = new Rectangle(9.0, 12.0);
        printShape(ranctagle);
        Square square = new Square(90.3);
        printShape(square);
        Ellipse ellipse = new Ellipse(9.0, 7.7);
        printShape(ellipse);
        Circle circle = new Circle(89.9);
        printShape(circle);
    }
    
    public static void printShape(Shape shape){
        System.out.println(shape + " Expansion: " + 
                           shape.getExpansion() + " AreaSize: " +
                           shape.getAreaSize());
    }
}