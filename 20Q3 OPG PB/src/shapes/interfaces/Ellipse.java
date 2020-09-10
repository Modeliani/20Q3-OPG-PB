
package shapes.interfaces;

import shapes.*;
import drawable.ExpasionableAndSizable;

public class Ellipse implements ExpasionableAndSizable{
    private double semiHorizontalAxis;
    private double semiVerticalAxis;
    
    public Ellipse(double semiHorizontalAxis, double semiVerticalAxis){
        this.semiHorizontalAxis = semiHorizontalAxis;
        this.semiVerticalAxis = semiVerticalAxis;
    }
    
    public double getSemiHorizontalAxis(){
        return semiHorizontalAxis;
    }
        
    public double getSemiVerticalAxis(){
        return semiVerticalAxis;
    }
    @Override
    public String toString(){
        return "Ellipse{semiHorizontalAxis: " + semiHorizontalAxis + ", semiVerticalAxis: " + semiVerticalAxis + '}';
    }
    
    @Override
    public double getLength(){
        return 02.0 * semiHorizontalAxis;
    }
    
    @Override
    public double getHeight(){
        return 02.0 * semiVerticalAxis;
    }
    
    public double getAreaSize(){
        return Math.PI * semiHorizontalAxis * semiVerticalAxis;
    }

    public void setLength(Double length) {
        this.semiHorizontalAxis = length/2;
    }

    public void setHeight(Double height) {
        this.semiVerticalAxis = height/2;
    }
}
