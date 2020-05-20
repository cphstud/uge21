package Sixth;

import Fourth.PrintSquare;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProperCaseTest {
    String sentence;
    ProperCase properCase;

    @Before
    public void setUp() throws Exception {
        sentence = "Her BOEDE kurt vErner med TO hund";
        properCase = new ProperCase();
    }

    @Test
    public void alterSentence() {
        String retVal = properCase.alterSentence(sentence);
        System.out.println(retVal);
    }
}