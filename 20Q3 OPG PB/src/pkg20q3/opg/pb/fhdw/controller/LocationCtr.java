
package pkg20q3.opg.pb.fhdw.controller;

import pkg20q3.opg.pb.fhdw.model.Location;
import pkg20q3.opg.pb.fhdw.utilities.Console;

public class LocationCtr {
    
    public static Location runNewDialogue(){
        Console.startDialogueSection();
        String street = Console.readString("Eneter street");
        int zip = Console.readInt("Enter zip-code", 1, 99999);
        String city = Console.readString("Enter city");
        Location location = new Location(street, zip, city);
        Console.concludeDialogueSection();
        return location;
    }
    
    public static void runEditDialogue(Location location){
        
        Console.startDialogueSection();
        if (location != null){
            for(boolean goOn = true; goOn;){
                String choice = Console.readChoice("Edit street", "Edit zip", "Edit City", "Exit");
                switch (choice){
                    case "Edit street":
                        location.setStreet(Console.readString("Enter street"));
                        break;
                    case "Edit zip":
                        location.setZip(Console.readInt("Enter zip-code", 1, 99999));
                        break;
                    case "Edit City":
                        location.setCity(Console.readString("Enter city"));
                        break;
                    case "Exit":
                        goOn = false;
                        break;
                }
            }
            }else{
            Console.printlnErrorMessage("No location to edit availavble");
        }
        Console.concludeDialogueSection();
    }
    
    public static void runMainDialogue(){
        Console.startDialogueSection();
        Location location = null;
        for(boolean goOn = true; goOn;){
            //Console.printlnErrorMessage(location != null ? "Current location: " + location.toString() : "No location available");
            if(location != null){
                Console.printlnErrorMessage("Current location: " + location.toString());
            }else{
                Console.printlnErrorMessage("No location available");
            }
            String choice = Console.readChoice("New location", "Edit Location", "Remove Location", "Exit");
                switch (choice){
                    case "New location":
                        location = runNewDialogue();
                        break;
                    case "Edit Location:":
                        runEditDialogue(location);
                        break;
                    case "Remove Location":
                        location = null;
                        break;
                    case "Exit":
                        goOn = false;
                        break;
                }
        }
    }
}
