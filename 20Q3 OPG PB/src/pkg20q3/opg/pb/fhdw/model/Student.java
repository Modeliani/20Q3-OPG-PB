
package pkg20q3.opg.pb.fhdw.model;


public class Student {
    
    //static variables
    public static final int FIRST_ID = 100001;
    public static final int LAST_ID  = 999999;
    private static int nextId = FIRST_ID;
    private int id;
    private String name;
    private Location residence;
    
    
    public Student(String name, Location residence){
        this.name = name;
        this.id = getNextId();
        this.residence = residence;
    }
     
    public Student(String firstname, String lastName, Location residence){
        setName(firstname, lastName);
        this.id = getNextId();
        this.residence = residence;
    }
    
    private int getNextId(){
        if (nextId<=LAST_ID){
            return nextId++;
        }else{
            return 0;
        }
    }
    
    public static int getNoOfAvailableIds(){
        return LAST_ID - nextId;
    }
    
    public static int getNoOfAssignedIds(){
        return nextId - FIRST_ID;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setName(String firstname, String lastName){
        setName(firstname + " " + lastName);
    }
    
    public Location getLoaction(){
        return residence;
    }
    
    public void setLocation(Location residence){
        this.residence = residence;
    }
    
    public boolean equals(Student student){
        if(this.id == student.getId()){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return "name: " + name + " id: " + id + " residence: " + residence.toString();
    }
}
