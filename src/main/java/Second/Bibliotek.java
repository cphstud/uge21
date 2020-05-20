package Second;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Bibliotek {
    ArrayList<Bog> books;

    public Bibliotek() {
        books = new ArrayList<>();
    }

    public void setBooks(ArrayList<Bog> books) {
        this.books = books;
    }

    public ArrayList<Bog> getBooks() {
        return books;
    }

    public void addBook(Bog bog) throws BookNotFoundException {
        if (!(isBookInList(bog))) {
            books.add(bog);
        } else {
            throw new BookNotFoundException("Book " + bog.getIsbn() + " already in list");
        }
    }
    public void printUnSorted() {
        Collections.sort(books);
        for(Bog b: books) {
            System.out.println(b);
        }
        System.out.println();
    }


    public void printSorted() {

        for(Bog b: books) {
            System.out.println(b);
        }
        System.out.println();
    }

    public boolean isBookInList(Bog bog){
        if (books.contains(bog)) {
            return false;
        }
        return true;
    }
}

