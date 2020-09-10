
package pkg20q3.opg.pb.fhdw.model;

import java.util.Objects;


public class Student extends Person {
    
    //static variables
    public static final int FIRST_ID = 100001;
    public static final int LAST_ID  = 999999;
    private static int      nextId = FIRST_ID;
    private        int      id;
    private        Subject  subject;
    
    public Student(String name, Location residence, Subject subject){
        super(name, residence);
        this.id = getNextId();
        this.subject = subject;
    }
     
    public Student(String firstname, String lastName, Location residence, Subject subject){
        super(firstname + " " + lastName, residence);
        this.id = getNextId();
        this.subject = subject;
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
    
    public Subject getSubject(){
        return subject;
    }
    
    public void setSubject(Subject subject){
        this.subject = subject;
    }
    
    public boolean equals(Object obj){
        /*
        if(!Objects.equals(student.getId(), this.id)){
            return false;
        }
        if(Objects.equals(student.getName(), super.getName())&&Objects.equals(student.getLocation(), super.getLocation())&&Objects.equals(student.getSubject(), this.getSubject())){
            return true;
        }else{
            return false;
        }
        */
        final Person other = (Person) obj;
        if(!Objects.equals(this.getLocation(), other.getLocation())) return false;
        return true;
    }
    
    public String toString(){
        return super.toString() +
               " id: " + id + 
               " subject: " + subject.toString();
    }
}
