package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Library {
    private Map<String,Book> library;
    private Set<String> genres;

    public Library() {
        this.library = new HashMap<>();
        this.genres=new HashSet<>();
    }

    @Override
    public String toString() {
        return "Library [library=" + library + "]";
    }
    
    public void add(Book book){
        library.put(book.getTitle(), book);
        genres.add(book.getGenre());
    }

    public boolean containsBook(String title){
        boolean contains;
        contains=library.containsKey(title);
        return contains;
    }

    public boolean containsGenre(String genre){
        boolean contains;
        contains=genres.contains(genre);
        return contains;
    }
    
    public Book getBook(String title){
        return library.get(title);
    }

    public void getBooksInGenre(String genre){
        genres.contains(genre);


    }
    
}
