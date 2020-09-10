package pkg20q3.opg.pb.article.controller;

import pkg20q3.opg.pb.article.model.StorageLocation;
import pkg20q3.opg.pb.article.utils.Console;

public class StorageLocationCtl {
    public static StorageLocation runNewDialogue() {
        Console.startDialogueSection();
        int storageLocation = Console.readInt("Enter location");
        String storageName = Console.readString("Enter name");
        Console.concludeDialogueSection();
        return new StorageLocation(storageLocation, storageName);
    }

    public static void runMainDialogue() {
        Console.startDialogueSection();
        StorageLocation storageLocation = null;
        String choice = Console.readChoice("New StorageLocation", "Exit");
        switch (choice) {
            case "New StorageLocation": {
                storageLocation = runNewDialogue();
                break;
            }
            case "Exit": {
                break;
            }
        }
        Console.concludeDialogueSection();
    }

    public static void runEditDialogue(StorageLocation storageLocation) {
        Console.startDialogueSection();

        if (storageLocation != null) {
            for (boolean goOn = true; goOn; ) {
                String choice = Console.readChoice("New location", "New name", "Exit");

                Console.startDialogueSection();

                switch (choice) {
                    case "New location": {
                        storageLocation.setStorageLocation(Console.readInt("New location"));
                        break;
                    }
                    case "New name": {
                        storageLocation.setStorageName(Console.readString("New name"));
                        break;
                    }
                    case "Exit": {
                        goOn = false;
                        break;
                    }
                }

                Console.concludeDialogueSection();
            }
        }

        Console.concludeDialogueSection();
    }
}
