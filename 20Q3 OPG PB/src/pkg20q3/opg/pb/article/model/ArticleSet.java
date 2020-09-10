package pkg20q3.opg.pb.article.model;

@SuppressWarnings({"FieldMayBeFinal", "RedundantIfStatement"})
public class ArticleSet {
    private Article[] articleArray;

    public ArticleSet() {
        articleArray = new Article[Article.LAST_ID];
    }

    public void add(Article article) {
        articleArray[(int) article.getId()] = article;
    }

    public Article getArticle(long id) {
        return isPresent(id) ? articleArray[(int) id] : null;
    }

    public void remove(long id) {
        if (isPresent(id)) {
            articleArray[(int) id] = null;
        }
    }

    public long getNo() {
        int count = 0;
        for (Article article : articleArray) {
            if (article != null) {
                count++;
            }
        }
        return count;
    }

    public Article[] getAll() {
        Article[] result = new Article[(int) this.getNo()];
        int index = 0;

        for (Article article : articleArray) {
            if (article != null) {
                result[index++] = article;
            }
        }

        return result;
    }

    private boolean isPresent(long id) {
        if (id >= Article.FIRST_ID && id <= Article.FIRST_ID + Article.getNumberOfAssignedIds()) {
            return true;
        } else {
            return false;
        }
    }
}