package Second;

import java.io.ObjectOutputStream;
import java.time.Period;

public class Bog implements Comparable<Bog>{
    //978-87-552-3333-1
    String isbn;
    String titel;
    int year;
    int numofPages;
    Loan loan;

    public Bog(String isbn, String titel, int year) {
        this.isbn = isbn;
        this.titel = titel;
        this.year = year;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public void setNumofPages(int numofPages) {
        this.numofPages = numofPages;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitel() {
        return this.titel;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        String msg = "Bogens data:";
        msg += this.titel + ", ";
        msg += this.isbn + ", ";
        msg += this.year + ", ";
        msg += this.numofPages + ", ";
        return msg;
    }

    @Override
    public boolean equals(Object otherObject) {
        boolean retVal = false;
        // er det den selv?
        if (otherObject == this)
            retVal = true;
        if (! (otherObject instanceof Bog ))
            return retVal;
        Bog otherBog = (Bog) otherObject;
        if (this.isbn.equals(otherBog.isbn)) {
           retVal=true;
        }
        return  retVal;
    }

    /*
    @Override
    public int compareTo(Bog o) {
        int sortVal = this.titel.compareTo(o.getTitel());
        //return -sortVal;
        return sortVal;
    }
     */
    @Override
    public int compareTo(Bog otherBog) {
        return this.year - otherBog.getYear();
    }
}
