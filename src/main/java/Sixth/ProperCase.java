package Sixth;

public class ProperCase {

    public String alterSentence(String sentence) {
        String[] lineArr = sentence.split(" ");
        String[] retValArr = new String[lineArr.length];
        for(int i=0;i<lineArr.length;i++) {
            if(isAllUppper(lineArr[i])) {
                retValArr[i] = lineArr[i];
            } else if(lineArr[i].length() > 3) {
                String tmpStr = lineArr[i].toLowerCase();
                char c = Character.toUpperCase(tmpStr.charAt(0));
                String newStr = c+tmpStr.substring(1,tmpStr.length());
                retValArr[i] = newStr;
            } else {
                String tmpStr = lineArr[i].toLowerCase();
                retValArr[i] = tmpStr;
            }
        }
        String retVal = String.join(" ",retValArr);
        return retVal;
    }

    public boolean isAllUppper(String s) {
        for(int i=0;i<s.length();i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
