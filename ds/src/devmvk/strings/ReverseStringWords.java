package devmvk.strings;

import java.util.ArrayList;

public class ReverseStringWords {

    public static String reverseString(String phrase){
         String[] split = phrase.split(".");
         String result = "";
        for (int i = split.length - 1 ; i >= 0 ; i--) {
            result += split[i] + ".";
        }
        return result.substring(0, result.length() - 1);
    }
}
