
package drawable;

//8.1

public interface Drawable {
    
    public double getLength();
    
    public double getHeight();
    
    public default double getExpansion(){
        return Math.max(getLength(), getHeight());
    }
    
    public default double getAreaSize(){
        return getLength() * getHeight();
    } 
}
