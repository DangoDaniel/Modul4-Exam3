package pl.coderslab;

public class Quote {

//    author (imię i nazwisko autora),
//    content (zawartość).

    private String author;
    private String content;

    public Quote(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
