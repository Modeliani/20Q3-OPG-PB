
package pkg20q3.opg.pb.fhdw.demo;

import pkg20q3.opg.pb.fhdw.model.Subject;


public class DemoEnum {
    public static void main(String[] args){
        Subject subject1 = Subject.APPLIED_COMPUTER_SCIENCE;
        Subject subject2 = Subject.IT_MANAGEMENT_AND_INFORMATION_SYSTEMS;
        Subject subject3 = Subject.getSubject(2);
        Subject subject4 = Subject.NO_SUBJECT;
        
        System.out.println("Equal?:" + subject1.equals(subject2));
        System.out.println("Equal?:" + subject1.equals(subject3));
        
        System.out.println("test getSubject " + subject3.toString());
        
        Subject[] subjectSet = Subject.values();
        for (int i = 0; i < subjectSet.length; i++){
            System.out.println("Nummer: " + subjectSet[i].ordinal() +
                               " Name: " + subjectSet[i].name() + 
                               " leserlicher name: " + subjectSet[i].toString());
        }
    }
}
