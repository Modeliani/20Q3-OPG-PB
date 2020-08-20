
package pkg20q3.opg.pb.fhdw.demo;

import pkg20q3.opg.pb.fhdw.model.*;

public class PersonDemo {
    
    public static void main(String[] args){
        Person person = new Person("Heinz", new Location("Street", 2345, "Stadt"));
        System.out.println(person.toString());
    }
}
