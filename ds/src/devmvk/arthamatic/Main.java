package devmvk.arthamatic;

import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        Instant t1 = Instant.now();
        PrimeNumber.printPrimes(100, 10);
        Instant t2 = Instant.now();
        System.out.print("\nTime taken :" + Duration.between(t1, t2).toMillis());
    }
}
