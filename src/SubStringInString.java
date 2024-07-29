import sun.plugin.javascript.navig.Array;

import java.util.HashMap;
import java.util.Map;

public class SubStringInString {

    public static void main(String[] args) {
        String word="I am working in Berlin";

        findSubStringPresent(word,"working");
        findMultipleSubStringPresent(word,"working in Munich");

    }

    private static void findMultipleSubStringPresent(String mainString, String subString) {
        String words[]=mainString.split(" ");
        if(subString.contains(" ")){
            String subWords[]=subString.split(" ");
            Map<Integer,String>subStringValue=new HashMap<>();
            int j=0;
            for(int i=0;i<words.length && j<subWords.length;i++){
                if(words[i].equalsIgnoreCase(subWords[j])){
                    subStringValue.put(i,words[i]);
                    j++;
                    i=0;
                }
            }

            if(subStringValue.size()==subWords.length)
                System.out.println(subStringValue);
            else
                System.out.println(" Multiple sub string not matched ");

        }else {
            findSubStringPresent(mainString,subString);
        }



    }

    public static void findSubStringPresent(String mainString, String subString) {
        String words[]=mainString.split(" ");

        for(int i=0;i<words.length;i++){
            if(words[i].equalsIgnoreCase(subString)){
                System.out.println("Matched sub string at position: "+i+" "+words[i]);
                break;
            }
        }
    }
}
