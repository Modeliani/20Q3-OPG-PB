package pkg20q3.opg.pb.article.apps;

import pkg20q3.opg.pb.article.controller.ArticleCtr;
import pkg20q3.opg.pb.article.model.Article;
import pkg20q3.opg.pb.article.model.StorageLocation;
import pkg20q3.opg.pb.article.utils.Console;

public class ArticleApp {
    public static void main(String[] args) {
        // StorageLocation
        StorageLocation storage1 = new StorageLocation(0, "Primär");
        StorageLocation storage2 = new StorageLocation(1, "Sekundär");
        StorageLocation storage3 = new StorageLocation(0, "Primär: Klon");

        // toString() and constructor
        Article article1 = new Article("Name", 3.50f, storage1);
        System.out.println("Article 1: " + article1);

        Article article2 = new Article("Test", 25, 1.25f, storage1);
        System.out.println("Article 2: " + article2);

        // equals()
        System.out.println("Are equal: " + article1.equals(article2));

        // static
        System.out.println("Available ids: " + Article.getNumberOfAvailableIds());
        System.out.println("Assigned ids: " + Article.getNumberOfAssignedIds());

        // More articles
        Article article3 = new Article("Test 1", 45, 1.25f, storage2);
        System.out.println(article3);
        Article article4 = new Article("Test 2", 1, 1.40f, storage2);
        System.out.println(article4);
        Article article5 = new Article("Test 3", 250, 6.70f, storage1);
        System.out.println(article5);

        // StorageLocation::equals()
        System.out.println("Same storage location: " + storage1.equals(storage3));

        // ArticleCtr
        Console.printlnMessage("Starting interactive app");
        ArticleCtr.runMainDialogue();
        Console.printlnMessage("Terminating interactive app");
    }
}
