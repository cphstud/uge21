package Fifth;

import java.util.Scanner;

public class MenuValg {
    Scanner sc = new Scanner(System.in);
    public int showMenu() throws IllegalArgumentException {
        int userChoice = 0;
        System.out.println("1. Beregn");
        System.out.println("2. Udskriv");
        System.out.println("3. Hjælp");
        userChoice = sc.nextInt();
        if (userChoice > 3 || userChoice < 1) {
            throw new IllegalArgumentException();
        }
        return userChoice;
    }
}
