
package pkg20q3.opg.pb.fhdw.model;


public class Person {
    
    private String name;
    private Location residence;

    public Person(String name, Location residence){
        this.name = name;
        this.residence = residence;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public Location getLocation(){
        return residence;
    }
    
    public void setName(Location residence){
        this.residence = residence;
    }
    
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        
        if (obj == null){
            return false;
        }   
        
        return true;
    }
    
    public String toString(){
        return this.name + " (" + residence + ")";
    }
}
