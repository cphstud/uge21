package Elleventh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class client {
    public static void main(String[] args) {
        SearchString searchString = new SearchString();
        String[] inputArr = {"Kurt","Verner","Anton","Brande"};
        // TODO: how to List<String> to ArrayList<String>

        ArrayList<String> inputList= new ArrayList<>(Arrays.asList(inputArr));
        /*
        ArrayList<String> inputList = new ArrayList<>();
        for(int i=0;i<inputArr.length;i++) {
            inputList.add(inputArr[i]);
        }

         */

        inputList.add("Snurre");
        inputList.add("Snup");
        inputList.add("TinTin");
        inputList.add("Haddock");

        String target = "TinTin";
        int posArr = 0;
        int posList = 0;
        try {
            posList = searchString.isStringInArr(inputList, target);
            posArr = searchString.isStringInArr(inputArr, target);
            System.out.println(target + " is at " + posArr);
            System.out.println(target + " is at " + posList);
        } catch (ArgumentNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
