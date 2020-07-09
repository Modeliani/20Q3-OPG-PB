package pkg20q3.opg.pb.fhdw.demo;

import pkg20q3.opg.pb.fhdw.utilities.Console;


public class ConsoleDemo {
    
    public static void main(String[] args){
        
        Console.printlnMessage("Mein Name ist Florian Wortmann");
        Console.printMessage(" Mein Frau heißt ");
        Console.printlnMessage("Anna");
        Console.printlnErrorMessage("Hier hat was nicht geklappt");
        
        Console.startDialogueSection();
        int number = Console.readInt("Bitte eine Zahl eingeben");
        Console.printlnMessage("Die Zahl lautet: " + number);
        Console.concludeDialogueSection();
        
        Console.startDialogueSection();
        String string = Console.readString("Bitte Text eingeben");
        Console.printlnMessage("Der eingelesene Text war: " + string);
        Console.concludeDialogueSection();
        
        Console.startDialogueSection();
        String choice = Console.readChoice("Wahl 1", "Wahl 2", "Wahl 3", "Wahl 4");
        Console.printlnMessage("Ihre Wahl war:" + choice);
    }
    
}