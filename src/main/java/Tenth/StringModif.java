package Tenth;

public class StringModif {
    public String modifyString(String s, String p, char c, char k) {
        // Kurt Verner r x -> "Kuxt Vexnex"
        String retVal = "";
        String newString = s + " " + p;

        if (newString.length() < 1) {
            throw new IllegalArgumentException("Zero length");
        } else {
        retVal = newString.replace(c,k);
        return retVal;
        }
    }
}
