package devmvk.strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] arr, int n){
        if(n == 0) return "-1";
        if(n == 1) return arr[0];

        Arrays.sort(arr);

        int minCharacters = Math.min(arr[0].length(), arr[n-1].length());

        int i = 1;
        while (i <= minCharacters && arr[0].substring(0, i).equals(arr[n - 1].substring(0, i))){
            i++;
        }

        if(i == 1) {
            return "-1";
        }else{
            return arr[0].substring(0, i-1);
        }
    }
}
