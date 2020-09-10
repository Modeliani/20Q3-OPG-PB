
package pkg20q3.opg.pb.article.model;

public class Customer extends Person{
    // Attribute
    public static final int FIRST_ID = 100001;
    public static final int LAST_ID  = 999999;
    
    private static int      nextId = FIRST_ID;
    private        long     customerId;
    
    public Customer(String name, String residence){
        super(name, residence);
        this.customerId = getNextId();
    }
    
    public long getCustomerId(){
      return customerId;
    }
    
    private static int getNextId() {
        if (nextId <= LAST_ID) {
            return nextId++;
        }
        return 0;
    }
    
    public String toString(){
        return "{" + super.toString() + " " + customerId + "}";
    }
}
