package pkg20q3.opg.pb.article.controller;

import pkg20q3.opg.pb.article.model.Article;
import pkg20q3.opg.pb.article.model.StorageLocation;
import pkg20q3.opg.pb.article.model.Unit;
import pkg20q3.opg.pb.article.utils.Console;

public class ArticleCtr {
    public static Article runNewDialogue() {
        Console.startDialogueSection();
        String name = Console.readString("Enter name");
        int onStock = 0;
        if (Console.readYesNo("Do you want to enter on stock?")) {
            onStock = Console.readInt("Enter on stock");
        }
        float salePrice = Console.readFloat("Enter sale price");
        StorageLocation storageLocation = StorageLocationCtl.runNewDialogue();
        Unit unit = readUnit();

        Console.concludeDialogueSection();
        return new Article(name, onStock, salePrice, storageLocation, unit);
    }

    public static void runEditDialogue(Article article) {
        Console.startDialogueSection();

        if (article != null) {
            for (boolean goOn = true; goOn; ) {
                String choice = Console.readChoice("New name",
                        "New on stock",
                        "New sale price",
                        "Edit storage location",
                        "New unit",
                        "Exit"
                );
                switch (choice) {
                    case "New name": {
                        article.setName(Console.readString("New name"));
                        break;
                    }
                    case "New on stock": {
                        article.setOnStock(Console.readInt("New on stock"));
                        break;
                    }
                    case "New sale price": {
                        article.setSalePrice(Console.readInt("New on stock"));
                        break;
                    }
                    case "Edit storage location": {
                        StorageLocation storageLocation = article.getStorageLocation();
                        StorageLocationCtl.runEditDialogue(storageLocation);
                        break;
                    }
                    case "New unit": {
                        Unit unit = readUnit();
                        article.setUnit(unit);
                        break;
                    }
                    case "Exit": {
                        goOn = false;
                        break;
                    }
                }
            }
        }

        Console.concludeDialogueSection();
    }

    public static void runMainDialogue() {
        Console.startDialogueSection();
        Article article = null;
        String choice = Console.readChoice("New Article", "Exit");
        switch (choice) {
            case "New Article": {
                article = runNewDialogue();
                break;
            }
            case "Exit": {
                break;
            }
        }
        Console.concludeDialogueSection();
    }

    private static Unit readUnit() {
        String[] unitNames = Unit.names();
        String choice = Console.readChoice(unitNames);
        return Unit.parse(choice);
    }
}
