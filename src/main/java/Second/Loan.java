package Second;

import java.time.LocalDate;

public class Loan {
    LocalDate loanDate;
    LocalDate dueDate;
    int loanerID ;

    public Loan(LocalDate loanDate, LocalDate dueDate, int id) {
        this.dueDate = dueDate;
        this.loanDate = loanDate;
        this.loanerID = id;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int getLoanerID() {
        return loanerID;
    }
}
