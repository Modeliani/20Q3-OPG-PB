
package pkg20q3.opg.pb.fhdw.controller;

import pkg20q3.opg.pb.fhdw.model.*;
import pkg20q3.opg.pb.fhdw.utilities.Console;

public class StudentCtr {
    
    public static Student runNewDialogue(){
        Console.startDialogueSection();
        String name = Console.readString("Enter name");
        Location residance = LocationCtr.runNewDialogue();
        
        Subject [] subjectSet = Subject.values();
        for(int i = 0; i < subjectSet.length; i++){
            Console.printlnMessage("(" + i + ")" + subjectSet[i].toString());
        }
        int SubjectNumber = Console.readInt("Enter Subject Number");
        Subject subject = Subject.getSubject(SubjectNumber);
        Console.printMessage(subject.toString());
        Student student = new Student(name, residance, subject);
        
        Console.concludeDialogueSection();
        
        return student;
    }
    
    public static void runEditDialogue(Student student){
        if(student != null){
            for(boolean goOn = true; goOn;){
                String choice = Console.readChoice("Edit name", 
                        "Edit residance", 
                        "New residance", 
                        "Exit");
                switch (choice){
                    case "Edit name":
                        student.setName(Console.readString("Enter name"));
                        break;
                    case "Edit residance":
                        LocationCtr.runEditDialogue(student.getLoaction());
                        break;
                    case "New residance":
                        //Hier wird der setLocation mit der Methode runNewDialogue() aufgerufen
                        student.setLocation(LocationCtr.runNewDialogue());
                        break;
                    case "Exit":
                        goOn = false;
                        break;
                }
            }
        }else{
            Console.printlnErrorMessage("No student to edit available");
        }
        Console.concludeDialogueSection();
    }
    
    public static void runMainDialogue(){
        
        Console.startDialogueSection();
        Student student = null;
                for(boolean goOn = true; goOn;){
                    if (student != null){
                        Console.printlnErrorMessage("Current student: " + student.toString());
                    }else{
                        Console.printlnErrorMessage("No Studnet available");
                    }
                    
                    String choice = Console.readChoice("New Student", 
                            "Edit Student", 
                            "Remove Student", 
                            "Exit");
                    switch(choice){
                        case "New Student":
                            student = runNewDialogue();
                            break;
                        case "Edit Student":
                            runEditDialogue(student);
                            break;
                        case "Remove Student":
                            student = null;
                            break;
                        case "Exit":
                            goOn = false;
                            break;
                    }
                    Console.concludeDialogueSection();
                }
    }
    
}
