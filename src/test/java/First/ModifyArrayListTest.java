package First;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ModifyArrayListTest {
    ModifyArrayList modifyArrayList;
    ArrayList<String> strings;
    String input1;
    String input2;
    String input3;


    @Before
    public void setUp() throws Exception {
        modifyArrayList = new ModifyArrayList();
        strings = new ArrayList<>();
        strings.add("Kurt");
        strings.add("Verner");
        strings.add("Otto");
        input1 = "Rehagel";
        input2 = "Otto";
        input3 = "";
    }

    @Test
    public void modList() {
        boolean retVal = modifyArrayList.modList(strings,input1);
        assertTrue(retVal);
    }

    @Test
    public void modList2() {
        boolean retVal = modifyArrayList.modList(strings,input2);
        assertTrue(retVal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void modList3() {
        boolean retVal = modifyArrayList.modList(strings,input3);
    }
}