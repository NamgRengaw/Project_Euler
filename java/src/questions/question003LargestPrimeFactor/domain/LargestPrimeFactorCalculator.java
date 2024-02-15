package questions.question003LargestPrimeFactor.domain;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactorCalculator {

    public static List<Long> primeNumbers = new ArrayList<>();

    public static long calculateLargestPrimeFactorFrom(Long factor) {
        long largestPrimeNumber = 2;
        for (long number = 2; number <= factor; number++) {
            if (isPrimeNumber(number)) {
                while (factor % number == 0) {
                    largestPrimeNumber = number;
                    factor = factor / number;
                }
            }
        }
        return largestPrimeNumber;
    }

    private static boolean isPrimeNumber(long number) {
        for (long anteriorNumbers = 2; anteriorNumbers < number; anteriorNumbers++) {
            if (number % anteriorNumbers == 0) {
                return false;
            }
        }
        return true;
    }
}
