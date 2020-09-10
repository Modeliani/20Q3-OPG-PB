
package shapes;

import drawable.Drawable;


public class Point extends Shape{
    
    @Override
    public String toString(){
        return "Point{}";
    }

    public double getLength(){
        return 0.0d;
    }

    public double getHeight(){
        return 0.0d;
    }

    @Override
    public double getAreaSize(){
        return 0.0d;
    }

    public void setLength(Double length) {
        
    }

    public void setHeight(Double height) {
        
    }

}
