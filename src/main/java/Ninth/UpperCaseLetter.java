package Ninth;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class UpperCaseLetter {
    Scanner sc = new Scanner(System.in);

    public void printUpperStartLetter() {
        ArrayList<String> strings = new ArrayList<>();
        String line = "Test";
        int counter = 0;
        while(true) {
            line = sc.nextLine();
            if (line.length()>1) {
                if (Character.isUpperCase(line.charAt(0))) {
                    counter++;
                }
            } else {
                break;
            }
            strings.add(line);
            System.out.println(line + " " + toHex(line));
        }
        System.out.println(counter + " started med stort");
    }
    public String toHex(String arg) {
        return String.format("%x", new BigInteger(1, arg.getBytes(/*YOUR_CHARSET?*/)));
    }
}
