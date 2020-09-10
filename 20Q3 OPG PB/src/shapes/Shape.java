
package shapes;


public abstract class Shape {
    
    public abstract double getLength();
    
    public abstract void setLength(Double length);
    
    public abstract double getHeight();
    
    public abstract void setHeight(Double height);
    
    public double getExpansion(){
        return getHeight() <= getLength() ? getHeight() : getLength();
    }
    
    public Double getExpansion(Boolean longVersion){
        if (getHeight() <= getLength()){
            return getHeight();
        }else{
            return getLength();
        }
    }
    
    public double getAreaSize(){
        return getLength() * getHeight();
    }
    
    @Override
    public String toString(){
        return "Shape{}";
    }
}
