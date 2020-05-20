package Elleventh;

import java.util.List;

public class SearchString  {
   public int isStringInArr(List<String> strArr, String str) throws ArgumentNotFoundException{
      int retVal = -1;
      for(String s : strArr) {
         if(s.equals(str)) {
            retVal = strArr.indexOf(str);
         }
      }
      if (retVal == -1) {
         throw new ArgumentNotFoundException("not in arraylist");
      }
      return  retVal;
   }

   public int isStringInArr(String[] strArr, String str) throws ArgumentNotFoundException{
      int retVal = -1;
      for(int i=0;i<strArr.length;i++) {
         if (strArr[i].equals(str) ) {
            retVal = i;
         }
      }
      if(retVal == -1) {
         throw new ArgumentNotFoundException("Fandt ikke " + str);
      }
      return  retVal;
   }
}
