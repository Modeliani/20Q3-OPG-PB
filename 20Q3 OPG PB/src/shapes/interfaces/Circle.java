
package shapes.interfaces;

import shapes.*;


public class Circle extends Ellipse{

    public Circle(double radius){
        super(radius, radius);
    }
    
    public String toString(){
        return "Circle{Radius: " + super.getSemiHorizontalAxis() + '}';
    }
}
