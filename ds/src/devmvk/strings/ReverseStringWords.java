package devmvk.strings;

import java.util.StringJoiner;

public class ReverseStringWords {

    public static String reverseString(String phrase){
        String[] split = phrase.split("[.]");
        StringJoiner result = new StringJoiner(".");
        for (int i = split.length - 1; i >= 0 ; i--) {
            result.add(split[i]);
        }
        return result.toString();
    }
}
