
package pkg20q3.opg.pb.fhdw.model;


public enum Department {
    
    NO_DEMPARTMENT("No Dempartment"),
    BUSINESS_SCIENDE("Bisiness Science"),
    COMPUTER_SCIENCE("Computer Scianece");
    
    String sting;
    
    private Department(String string){
        this.sting = string;
    }
    
    public static String[] strings(){
        Department[] departments = Department.values();
        String[] result = new String[departments.length];
        for(Department department: departments){
            result[department.ordinal()] = department.toString();
        }
        return result;
    }
    
    public static Department parse(String string){
        for(Department department: Department.values()){
            if(department.toString().equals(string)){
                return department;
            }
        }
        return NO_DEMPARTMENT;
    }
    
}
