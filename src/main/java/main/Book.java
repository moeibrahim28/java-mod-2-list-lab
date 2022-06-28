package main;
public class Book {
    private String title;
    private String genre;
    private int numPages;
    
    public Book(String title, String genre, int numPages) {
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + " genre=" + genre +", numPages=" + numPages+"]";
    }

    
    
}
