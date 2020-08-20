
package pkg20q3.opg.pb.fhdw.model;


public class Lecturer extends Person {
    private Department department;
    private Role role;
    
    public Lecturer(String name, Location residence, Department department, Role role){
        super(name, residence);
        this.department = department;
        this.role = role;
    }
    
    public Department getDepartment(){
        return department;
    }
    
    public void setDepartment(Department department){
        this.department = department;
    }
    
    public Role getRole(){
        return role;
    }
    
    public void setRole(Role role){
        this.role = role;
    }
    
    public String toString(){
        return super.toString() +
               " Department: " + department + 
               " Role: " + role;
    }
}
