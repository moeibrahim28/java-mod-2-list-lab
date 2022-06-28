package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Library {
    private Map<String,Book> library;

    public Library() {
        this.library = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Library [library=" + library + "]";
    }
    
    public void add(Book book){
        library.put(book.getTitle(), book);
    }

    public boolean containsBook(String title){
        boolean contains;
        contains=library.containsKey(title);
        return contains;
    }
    
    public Book getBook(String title){
        return library.get(title);
    }
    
}
