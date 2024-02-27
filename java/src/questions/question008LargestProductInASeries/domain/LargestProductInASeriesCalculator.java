package questions.question008LargestProductInASeries.domain;

import java.lang.Math;

public class LargestProductInASeriesCalculator {

    public static long calculateLargestProductByAdjacentNumbersWith(int adjacentNumbersQuantity, String series) {
        long result = 0;
        for (int i = 0; i <= (series.length() - adjacentNumbersQuantity); i++) {
            final String seriesRange = series.substring(i, i + adjacentNumbersQuantity);
            long product = 1;
            for (int j = 0; j < adjacentNumbersQuantity; j++) {
                final long number = Character.getNumericValue(seriesRange.charAt(j));
                product *= number;
            }
            result = Math.max(product, result);
        }

        return result;
    }

}