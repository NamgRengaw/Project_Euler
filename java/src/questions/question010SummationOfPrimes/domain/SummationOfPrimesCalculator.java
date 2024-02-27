package questions.question010SummationOfPrimes.domain;

import java.util.Arrays;

public class SummationOfPrimesCalculator {

    public static long calculateSummationOfPrimesBelow(int ceilling) {
        long summationOfPrimeNumber = 0;
        for (long number = 2; number <= ceilling; number++) {
            if (isPrimeNumber(number)) {
                summationOfPrimeNumber += number;
            }
        }
        return summationOfPrimeNumber;
    }

    private static boolean isPrimeNumber(long number) {
        for (long anteriorNumbers = 2; anteriorNumbers < (number / 2) + 1; anteriorNumbers++) {
            if (number % anteriorNumbers == 0) {
                return false;
            }
        }
        return true;
    }

    public static long calculateSummationOfPrimesUsingSieveOfEratosthenes(int ceilling) {
        boolean[] sieve = new boolean[ceilling + 1];

        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i <= ceilling; ++i) {
            if (sieve[i]) {
                for (int j = 2 * i; j <= ceilling; j += i) {
                    sieve[j] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i <= ceilling; ++i) {
            if (sieve[i]) {
                sum += i;
            }
        }
        return sum;
    }

}
