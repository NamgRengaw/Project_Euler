package questions.question002EvenFibonacciNumbers.test;

import questions.question002EvenFibonacciNumbers.domain.FibonacciNumbersCalculator;

public class EvenFibonacciNumbersTest {

    public static void main(String... args) {
        boolean assertion = shouldReturnFortyFourAsResultFromAlgorithm();
        if (assertion) {
            System.out.println("- Test Validated!");
            System.out.println("- Question Answer: " + shouldReturnAnswerAsResultFromAlgorithm());
            System.out.println("- Question Answer: " + shouldReturnAnswerAsResultFromAlgorithmWithStream());
            return;
        }
        System.out.println("- Test Failed!");
    }

    private static boolean shouldReturnFortyFourAsResultFromAlgorithm() {
        final int firstNumber = 1;
        final int secondNumber = 2;
        final int ceillingSequenceNumber = 89;

        final int answer = 44;

        final int result = FibonacciNumbersCalculator.calculateSumEvenFibonacciNumbersUntilCeillingSequenceNumber(
                firstNumber,
                secondNumber, ceillingSequenceNumber);

        if (result - answer == 0) {
            return true;
        }
        return false;

    }

    private static int shouldReturnAnswerAsResultFromAlgorithm() {
        final int firstNumber = 1;
        final int secondNumber = 2;
        final int ceillingSequenceNumber = 4_000_000;

        return FibonacciNumbersCalculator.calculateSumEvenFibonacciNumbersUntilCeillingSequenceNumber(firstNumber,
                secondNumber, ceillingSequenceNumber);
    }

    private static int shouldReturnAnswerAsResultFromAlgorithmWithStream() {
        final int firstNumber = 1;
        final int secondNumber = 2;
        final int ceillingSequenceNumber = 4_000_000;

        return FibonacciNumbersCalculator.calculateSumEvenFibonacciNumbersUntilCeillingSequenceNumberWithStream(
                firstNumber,
                secondNumber, ceillingSequenceNumber);
    }

}
