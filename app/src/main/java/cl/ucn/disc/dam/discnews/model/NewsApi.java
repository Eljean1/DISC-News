package cl.ucn.disc.dam.discnews.model;

/**
 * Created by jeanc on 26-10-2017.
 */

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
public class NewsApi {

    @Getter
    private String status;
    @Getter
    private String source;
    @Getter
    private String sortBy;
    @Getter
    private List<Article> articles = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
