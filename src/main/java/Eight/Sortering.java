package Eight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {
    Scanner sc = new Scanner(System.in);

    public void sortStringsFromKeyboard() {
        ArrayList<String> strenge = new ArrayList<>();
        int counter=0;
        int limit = 5;
        while(counter<limit) {
            System.out.println("indtast ord");
            String word = sc.nextLine();
            strenge.add(word);
            counter++;
        }
        for (String s: strenge) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
        Collections.sort(strenge);
        for (String s: strenge) {
            System.out.println(s);
        }
    }
}
