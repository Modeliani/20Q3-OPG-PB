
package pkg20q3.opg.pb.fhdw.apps;

import pkg20q3.opg.pb.fhdw.controller.StudentCtr;
import pkg20q3.opg.pb.fhdw.utilities.Console;


public class StudentApp {
    public static void main(String[] args){
                
        Console.printlnMessage("Student App starts:");
        StudentCtr.runMainDialogue();
        Console.printlnMessage("Student App terminates");
                
    }
}