package First;

import java.util.ArrayList;

public class ModifyArrayList {

    public boolean modList(ArrayList<String> strenge, String str) throws IllegalArgumentException {
        boolean retVal = false;
        if (str.length()==0) {
            throw new IllegalArgumentException("Tom sreng");
        }
        if (!strenge.contains(str)) {
            strenge.add(str);
            retVal = true;
        }
        return retVal;
    }
}
