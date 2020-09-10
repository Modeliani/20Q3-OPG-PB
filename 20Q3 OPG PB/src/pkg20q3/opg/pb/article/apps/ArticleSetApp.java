package pkg20q3.opg.pb.article.apps;

import pkg20q3.opg.pb.article.controller.ArticleSetCtr;
import pkg20q3.opg.pb.article.utils.Console;

public class ArticleSetApp {
    public static void main(String[] args) {
        Console.printlnMessage("ArticleSet App starts");
        ArticleSetCtr.runMainDialogue();
        Console.printlnMessage("ArticleSet App terminates");
    }
}