package pl.izabela.biblioteka.web;

public class BookResponse {
    private String title;
    private String author;

    public BookResponse(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}
