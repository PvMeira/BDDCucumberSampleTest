package cucumber.book;

import java.util.Date;

/**
 * Created by pvmeira on 10/05/17.
 */
public class Book {

    private String title;
    private String author;
    private Date published;

    public Book(String title, String author, Date published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublished() {
        return published;
    }
}
