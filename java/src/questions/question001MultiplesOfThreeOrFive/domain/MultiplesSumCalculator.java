package questions.question001MultiplesOfThreeOrFive.domain;

public class MultiplesSumCalculator {

    public static int calculateSumMultiplesWithCeilling(final int ceilling, final int... operrands) {
        int sumOfMultiples = 0;
        for (int iterator = 0; iterator < ceilling; iterator++) {
            if (isMultipleOf(iterator, operrands)) {
                sumOfMultiples += iterator;
            }
        }

        return sumOfMultiples;
    }

    public static boolean isMultipleOf(final int possibleMultiple, final int... operrands) {
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