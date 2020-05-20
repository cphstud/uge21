package Second;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class client {
    static Bibliotek bibliotek;
    static ArrayList<Bog> books;
    static Bog bog1;
    static Bog bog2;
    static Bog bog3;
    static Bog bog4;
    static Bog bog5;
    static Bog bog6;

    public static void main(String[] args) {
        bibliotek = new Bibliotek();
        books = new ArrayList<>();
        bog1 = new Bog("978-87-552-3333-1","Kurts Verner",1990);
        bog2 = new Bog("978-97-552-3333-1","Kurts Venner",1994);
        bog3 = new Bog("978-17-552-3333-1","Kurts Børge",1991);
        bog4 = new Bog("978-67-552-3333-1","Kurts Exkstre",1950);
        bog5 = new Bog("978-27-552-3333-1","Antons Exkstre",1950);
        bog6 = new Bog("178-27-552-3333-1","Snuure Snup",1956);
        bog1.setNumofPages(45);
        bog2.setNumofPages(25);
        bog3.setNumofPages(145);
        bog4.setNumofPages(345);
        bog5.setNumofPages(22);
        bog6.setNumofPages(22);

        String ldate = "2019-11-01";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        //Loan loan1 = new Loan();
        books.add(bog1);
        books.add(bog2);
        books.add(bog3);
        books.add(bog4);
        books.add(bog5);
        bibliotek.setBooks(books);
        ArrayList<Bog> newList = bibliotek.getBooks();
        //ArrayList<Bog> newListCopy = newList;
        ArrayList<Bog> newListCopy = new ArrayList<Bog>(newList);
        //Collections.copy(newListCopy,newList);
        for( Bog b : newList) {
            System.out.println(b);
        }
        newListCopy.add(bog6);
        System.out.println();
        for( Bog b : newListCopy) {
            System.out.println(b);
        }
        System.out.println();
        for( Bog b : newList) {
            System.out.println(b);
        }
    }
}
