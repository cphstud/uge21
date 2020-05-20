package Fourth;

public class PrintSquare {

    public void printSquare(int size) {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.print("*   ");
            }
            System.out.println("");
        }
    }
}
