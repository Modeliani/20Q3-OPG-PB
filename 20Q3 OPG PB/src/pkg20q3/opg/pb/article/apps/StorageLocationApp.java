package pkg20q3.opg.pb.article.apps;

import pkg20q3.opg.pb.article.controller.StorageLocationCtl;
import pkg20q3.opg.pb.article.utils.Console;

public class StorageLocationApp {
    public static void main(String[] args) {
        Console.printlnMessage("StorageLocation App started");
        StorageLocationCtl.runMainDialogue();
        Console.printlnMessage("StorageLocation App terminated");
    }
}
