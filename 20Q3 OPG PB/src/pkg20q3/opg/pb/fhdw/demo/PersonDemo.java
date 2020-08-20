
package pkg20q3.opg.pb.fhdw.demo;

import pkg20q3.opg.pb.fhdw.model.*;

public class PersonDemo {
    
    public static void main(String[] args){
        Person person = new Person("Heinz", new Location("Street", 2345, "Stadt"));
        System.out.println(person.toString());
        Lecturer doz1 = new Lecturer("Frank", new Location("Strasse 1", 2345, "Stadt"), Department.COMPUTER_SCIENCE, Role.VISITING_LECTURER);
        System.out.println(doz1.toString());
        Student student = new Student("Peter", new Location("Strasse 199", 2345, "Stadt"), Subject.BUSNESS_COMPUTER_SCIENCE);
        System.out.println(student.toString());
        
        person = student; // Polymorpie
        System.out.println(person); // Late Binding
        //person = new Lecturer("Franz", new Location("Hauptstrasse 1234", 43245, "Altstadt"), Department.BUSINESS_SCIENDE, Role.PROFESSOR_ONLY);
        //System.out.println(person); // Late Binding
        
        if (person instanceof Student){ // Typabfrage mit instanceof
            student = (Student) person; //Cast
        }
        System.out.println(student);
    }
}
