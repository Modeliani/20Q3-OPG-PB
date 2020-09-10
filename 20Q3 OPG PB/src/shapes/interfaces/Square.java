
package shapes.interfaces;

import shapes.*;


public class Square extends Rectangle{
    
    public Square(double length){
        super(length, length);
    }
    
        public String toString(){
        return "Square{length: " + super.getLength() + '}';
    }
    
}
