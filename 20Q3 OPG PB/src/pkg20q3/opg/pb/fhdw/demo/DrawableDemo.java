
package pkg20q3.opg.pb.fhdw.demo;

import drawable.ExpasionableAndSizable;
import shapes.interfaces.*;
        
public class DrawableDemo {
    
    public static void main(String[] args){
        ExpasionableAndSizable expasionableAndSizables[] = {
          new Point(),
          new Line(7.5),
          new Square(19.5),
          new Rectangle(3.4, 4.0),
          new Circle(3.3),
          new Ellipse(2.0, 3.0)
        };
        
        printShapes(expasionableAndSizables);
        
    }
    
    private static void printShapes(ExpasionableAndSizable[] expasionableAndSizables){
        for (ExpasionableAndSizable expasionableAndSizable : expasionableAndSizables){
            System.out.println(expasionableAndSizable
                    + ": length = " +       expasionableAndSizable.getLength()
                    + ", height = " +       expasionableAndSizable.getHeight()
                    + ", expansion = " +    expasionableAndSizable.getExpansion()
                    + ", area size = " +    expasionableAndSizable.getAreaSize()
            );
        }
    }
    
}
