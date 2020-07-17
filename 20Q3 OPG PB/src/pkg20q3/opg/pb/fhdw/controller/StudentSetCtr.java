
package pkg20q3.opg.pb.fhdw.controller;

import pkg20q3.opg.pb.fhdw.utilities.Console;
import pkg20q3.opg.pb.fhdw.model.StudentSet;
import pkg20q3.opg.pb.fhdw.model.Student;


public class StudentSetCtr {
    public static void printStudents(StudentSet students){
        if (students.getNo() == 0){
            Console.printlnMessage("*** no students available ***");
        }else{
            Console.printlnMessage("Students actually available:");
            for(Student student: students.getAll()){
                Console.printlnMessage("- " + student);
            }
        }
    }
    
    public static void runMainDiaglogue(){
        Console.startDialogueSection();
        StudentSet studentSet = new StudentSet();
        for (boolean goOn = true; goOn;){
            printStudents(studentSet);
            String choice = Console.readChoice("Add student", "Edit student", "Remove student", "Exit");
            int id;
            switch(choice){
                case "Add student":
                    studentSet.add(StudentCtr.runNewDialogue());
                    break;
                case "Edit student":
                    id = Console.readInt("Enter id " + Student.FIRST_ID + " to " + Student.LAST_ID, Student.FIRST_ID, Student.LAST_ID);
                    StudentCtr.runEditDialogue(studentSet.getStudent(id));
                    break;
                case "Remove student":
                    id = Console.readInt("Enter id", Student.FIRST_ID, Student.LAST_ID);
                    studentSet.remove(id);
                case "Exit":
                    goOn = false;
                    break;
            }
        }
        printStudents(studentSet);
        Console.concludeDialogueSection();
    }
}
