package cl.ucn.disc.dam.discnews.model;

import lombok.Getter;

/**
 * Created by jeanc on 26-10-2017.
 */

public class Article {

    @Getter
    private Object author;
    @Getter
    private String title;
    @Getter
    private String description;
    @Getter
    private String url;
    @Getter
    private String urlToImage;
    @Getter
    private String publishedAt;

    public Object getAuthor() {
        return author;
    }

    public void setAuthor(Object author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
}
