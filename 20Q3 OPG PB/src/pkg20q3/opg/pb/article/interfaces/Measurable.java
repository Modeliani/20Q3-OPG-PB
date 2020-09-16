
package pkg20q3.opg.pb.article.interfaces;

import pkg20q3.opg.pb.article.model.Unit;

public interface Measurable{
    
    public Unit getUnit();
    
    public double getAmount();
    
    public void setUnit(Unit unit);
    
    public void setAmount(double amount);
    
}
