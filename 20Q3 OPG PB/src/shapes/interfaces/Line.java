
package shapes.interfaces;

import shapes.*;
import drawable.ExpasionableAndSizable;


public class Line implements ExpasionableAndSizable{
    private double length;
    
    public Line(double length){
        this.length = length;
    }
    
    @Override
    public String toString(){
        return "Line{length: " + length + '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public double getHeight() {
        return 0.0d;
    }

    public void setHeight(Double height) {
    }
    
    public double getAreaSize(){
        return 0.0d;
    }
}
