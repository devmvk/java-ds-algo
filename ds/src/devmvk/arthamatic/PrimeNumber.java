package devmvk.arthamatic;

import java.util.Date;

public class PrimeNumber {

    public static boolean isPrimeNumber(int n){
        if(n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if((n % i) == 0) return false;
        }
        return true;
    }

    public static void printPrimes(int n){
        for (int i = 2; i <= n; i++) {
            if(isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void printPrimes(int from, int to){
        if(from > to) return;
        for (int i = from; i <= to; i++) {
            if(isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
}
