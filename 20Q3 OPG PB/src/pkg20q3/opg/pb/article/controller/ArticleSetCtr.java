package pkg20q3.opg.pb.article.controller;

import pkg20q3.opg.pb.article.model.Article;
import pkg20q3.opg.pb.article.model.ArticleSet;
import pkg20q3.opg.pb.article.utils.Console;

public class ArticleSetCtr {
    public static void printArticleSet(ArticleSet articleSet) {
        if (articleSet.getNo() == 0) {
            Console.printlnMessage("No articles available");
        } else {
            Console.printlnMessage("Articles actually available");
            for (Article article : articleSet.getAll()) {
                Console.printlnMessage("- " + article);
            }
        }
    }

    public static void runMainDialogue() {
        Console.startDialogueSection();

        ArticleSet articleSet = new ArticleSet();
        int id;
        for (boolean goOn = true; goOn; ) {
            printArticleSet(articleSet);
            String choice = Console.readChoice("Add article", "Edit article", "Remove article", "Exit");

            Console.startDialogueSection();

            switch (choice) {
                case "Add article": {
                    articleSet.add(ArticleCtr.runNewDialogue());
                    break;
                }
                case "Edit article": {
                    id = Console.readInt(
                            "Enter id from " + Article.FIRST_ID + " to " + Article.LAST_ID,
                            Article.FIRST_ID,
                            Article.LAST_ID
                    );
                    Article article = articleSet.getArticle(id);
                    ArticleCtr.runEditDialogue(article);
                    break;
                }
                case "Remove article": {
                    id = Console.readInt(
                            "Enter id from " + Article.FIRST_ID + " to " + Article.LAST_ID,
                            Article.FIRST_ID,
                            Article.LAST_ID
                    );
                    articleSet.remove(id);
                    break;
                }
                case "Exit": {
                    goOn = false;
                    break;
                }
            }

            Console.concludeDialogueSection();
        }

        Console.concludeDialogueSection();
    }
}