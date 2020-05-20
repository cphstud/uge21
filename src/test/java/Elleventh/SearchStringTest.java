package Elleventh;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchStringTest {
    SearchString searchString;
    String[] inputArr;
    String target;


    @Before
    public void setUp() throws Exception {
        searchString = new SearchString();
        inputArr = new String[] {"Kurt","Verner","Anton","Brande"};
        target = "Verner";
    }

    @Test
    public void isStringInArr() throws ArgumentNotFoundException {
        int actual = searchString.isStringInArr(inputArr,target);
        int expected = 1;
        assertEquals(expected,actual);
    }
}