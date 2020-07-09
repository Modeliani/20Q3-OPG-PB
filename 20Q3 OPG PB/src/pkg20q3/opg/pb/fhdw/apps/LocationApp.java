
package pkg20q3.opg.pb.fhdw.apps;

import pkg20q3.opg.pb.fhdw.controller.LocationCtr;
import pkg20q3.opg.pb.fhdw.utilities.Console;

public class LocationApp {
    
    public static void main(String[] args){
        
        Console.printlnMessage("Location App starts:");
        LocationCtr.runMainDialogue();
        Console.printlnMessage("Location App terminates");
                
    }
    
}
