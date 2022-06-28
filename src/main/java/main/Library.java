package main;

import java.util.ArrayList;
import java.util.List;



public class Library {
    private List<Book> library;

    public Library() {
        this.library = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Library [library=" + library + "]";
    }
    
    public void add(Book book){
        library.add(book);
    }
    
    
    
}
