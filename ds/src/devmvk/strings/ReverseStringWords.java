package devmvk.strings;

import java.util.StringJoiner;



/*
Reverse words in a given string
https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1#

Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

*/
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
