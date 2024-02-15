package questions.question001MultiplesOfThreeOrFive.domain;

import java.util.stream.IntStream;

public class MultiplesSumCalculator {

    public static int calculateSumMultiplesWithCeillingInStream(final int ceilling, int... operrands) {
        return IntStream.range(0, ceilling).reduce(0,
                (sum, value) -> isMultipleOf(value, operrands) ? sum + value : sum);
    }

    public static int calculateSumMultiplesWithCeilling(final int ceilling, final int... operrands) {
        int sumOfMultiples = 0;
        for (int iterator = 0; iterator < ceilling; iterator++) {
            if (isMultipleOf(iterator, operrands)) {
                sumOfMultiples += iterator;
            }
        }
        return sumOfMultiples;
    }

    private static boolean isMultipleOf(final int possibleMultiple, final int... operrands) {
        boolean isMultiple = false;
        for (int operrand : operrands) {
            int module = possibleMultiple % operrand;
            if (module == 0) {
                isMultiple = true;
            }
        }
        return isMultiple;
    }

}