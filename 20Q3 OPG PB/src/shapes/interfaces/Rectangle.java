
package shapes.interfaces;

import shapes.*;
import drawable.ExpasionableAndSizable;

public class Rectangle implements ExpasionableAndSizable{

    private double length;
    private double height;
    
    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }
    
    public String toString(){
        return "Rectangle{length: " + length + ", height: " + height + '}';
    }

    @Override
    public double getLength() {
        return length;
    }

    public void setLength(Double length) {
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    public double getAreaSize(){
        return getHeight() * getLength();
    }
    
}
