
package shapes;

import drawable.Drawable;

public class Rectangle implements Drawable{

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
    
}
