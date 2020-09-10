
package drawable;

public interface Expansionable {
    
    public double getLength();
    
    public double getHeight();
    
    public default double getExpansion(){
        return Math.max(getLength(), getHeight());
    }
    
}
