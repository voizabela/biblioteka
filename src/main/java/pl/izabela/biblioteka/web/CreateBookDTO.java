package pl.izabela.biblioteka.web;

public class CreateBookDTO {

    private String title;
    private String bookAuthor;

    public CreateBookDTO(String title, String bookAuthor) {
        this.title = title;
        this.bookAuthor = bookAuthor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
