package questions.question002EvenFibonacciNumbers.domain;

import java.util.stream.Stream;

public class FibonacciNumbersCalculator {

    public static int calculateSumEvenFibonacciNumbersUntilCeillingSequenceNumberWithStream(final int firstNumber,
            final int secondNumber, final int ceillingSequenceNumber) {
        return Stream.iterate(new int[] { 0, 1 }, array -> new int[] { array[1], array[0] + array[1] })
                .takeWhile(array -> array[1] <= ceillingSequenceNumber)
                .filter(array -> array[1] % 2 == 0)
                .mapToInt(array -> array[1])
                .sum();
    }

    public static int calculateSumEvenFibonacciNumbersUntilCeillingSequenceNumber(final int firstNumber,
            final int secondNumber, final int ceillingSequenceNumber) {

        int lastSequenceValue = firstNumber;
        int actualSequenceValue = secondNumber;
        int evenSum = 0;

        if (lastSequenceValue % 2 == 0) {
            evenSum += lastSequenceValue;
        }

        while (actualSequenceValue <= ceillingSequenceNumber) {
            if (actualSequenceValue % 2 == 0) {
                evenSum += actualSequenceValue;
            }
            final int temporaryValueStorage = actualSequenceValue;
            actualSequenceValue += lastSequenceValue;
            lastSequenceValue = temporaryValueStorage;
        }

        return evenSum;
    }

}