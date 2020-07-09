
package pkg20q3.opg.pb.fhdw.model;


public class Location{
    private String street;
    private int zip;
    private String city;
    
    public Location(String street, int zip, String city){
        this.street = street;
        this.zip = zip;
        this.city = city;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    public int getZip(){
        return zip;
    }
    
    public void setZip(int zip){
        this.zip = zip;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String toString(){
        return "street: " 
                + street + " zip: " 
                + zip + " city: " 
                + city;
    }
    
    public boolean equals(Location location){
        if(this == location){
            return true;
        }else{
            return false;
        }
    }
}
