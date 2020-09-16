
package pkg20q3.opg.pb.article.model;

import pkg20q3.opg.pb.article.interfaces.Sellable;

public class LotteryTicket implements Sellable{
    private String name;
    private float  salePrice;
    private Unit unit;
    private double amount;

    public LotteryTicket(String name, float salePrice) {
        this.name = name;
        this.salePrice = salePrice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public float getSalesPrice() {
        return salePrice;
    }

    public void setSalesPrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public Unit getUnit(){
        return unit;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public void setUnit(Unit unit){
        this.unit = unit;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return "LotteryTicket{" + "name='" + name + '\'' + ", salePrice=" + salePrice + '}';
    }
}