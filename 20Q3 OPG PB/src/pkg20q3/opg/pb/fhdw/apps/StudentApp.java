
package pkg20q3.opg.pb.fhdw.apps;

import pkg20q3.opg.pb.fhdw.model.*;


public class StudentApp {
    public static void main(String[] args){
        Location location1 = new Location("Strasse", 12345, "Paderborn");
        Location location2 = new Location("Strasse2", 12345, "Paderborn");
        Student student1 = new Student("Hans", "Peter", location1);
        System.out.println("Name: " + student1.getName());
        System.out.println("Id: " + student1.getId());
        Student student2 = new Student("Karl", location2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        Student student3 = new Student("Paul", location2);
        System.out.println(student3.toString());
    }
}