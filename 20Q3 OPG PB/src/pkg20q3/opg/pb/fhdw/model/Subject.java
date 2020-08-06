
package pkg20q3.opg.pb.fhdw.model;


public enum Subject {
    NO_SUBJECT("No Subject"),
    APPLIED_COMPUTER_SCIENCE("Applied Computer Science"),
    BUSNESS_COMPUTER_SCIENCE("Buniness Computer Science"),
    IT_MANAGEMENT_AND_INFORMATION_SYSTEMS("IT Management and Information Systems"),
    GENERAL_MANAGEMENT("General Management");
        
    private final String name;
    
    Subject(String name){
        this.name = name;
    }
    
    public static Subject subject(int i){
        Subject subject = Subject.NO_SUBJECT;
        Subject [] subjectSet = Subject.values();
        for(int j = 0; j < subjectSet.length; j++){
            if(i == j){
                subject = subjectSet[i];
            }
        }
        
        return subject;
    }
    
    public static Subject parse(String choice){
        Subject subject;
        
        switch(choice){
            case "Applied Computer Science":{
                subject = Subject.APPLIED_COMPUTER_SCIENCE;
                break;
            }
            case "Buniness Computer Science":{
                subject = Subject.BUSNESS_COMPUTER_SCIENCE;
                break;
            }
            case "IT Management and Information Systems":{
                subject = Subject.IT_MANAGEMENT_AND_INFORMATION_SYSTEMS;
                break;
            }
            case "General Management":{
                subject = Subject.GENERAL_MANAGEMENT;
                break;
            }
            default:{
                subject = Subject.NO_SUBJECT;
                break;
            }
        }
        return subject;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public static Subject getSubject(int i){
        int j = 0;
        for(Subject subject: Subject.values()){
            if (i == j){
                return subject;
            }
            j++;
        }
        return Subject.NO_SUBJECT;
    }
    
}
