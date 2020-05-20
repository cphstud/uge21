package Second;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BibliotekTest {
    Bibliotek bibliotek;
    ArrayList<Bog> books;
    Bog bog1;
    Bog bog2;
    Bog bog3;
    Bog bog4;
    Bog bog5;

    @Before
    public void setUp() throws Exception {
        bibliotek = new Bibliotek();
        books = new ArrayList<>();
        bog1 = new Bog("978-87-552-3333-1","Kurts Verner",1990);
        bog2 = new Bog("978-97-552-3333-1","Kurts Venner",1994);
        bog3 = new Bog("978-17-552-3333-1","Kurts Børge",1991);
        bog4 = new Bog("978-67-552-3333-1","Kurts Exkstre",1950);
        bog5 = new Bog("978-27-552-3333-1","Antons Exkstre",1950);
        bog1.setNumofPages(45);
        bog2.setNumofPages(25);
        bog3.setNumofPages(145);
        bog4.setNumofPages(345);
        bog5.setNumofPages(22);
        books.add(bog1);
        books.add(bog2);
        books.add(bog3);
        books.add(bog4);
        books.add(bog5);
        bibliotek.setBooks(books);
    }

    @Test
    public void isBookInList() {
        boolean val = bibliotek.isBookInList(bog3);
        assertTrue(val);
    }
    @Test
    public void isBookInList2() {
        boolean val = bibliotek.isBookInList(bog5);
        assertTrue(val);
    }

    @Test
    public void printUnSorted() {
        bibliotek.printUnSorted();
    }

    @Test
    public void printSorted() {
        bibliotek.printSorted();
    }
}
