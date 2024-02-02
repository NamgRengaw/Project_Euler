package questions.question001MultiplesOfThreeOrFive.test;

import questions.question001MultiplesOfThreeOrFive.domain.MultiplesSumCalculator;

public class MultiplesOfThreeOrFiveTest {

    public static void main(String... args) {
        boolean assertionOne = shouldReturnTwentyThreeAsResultFromAlgorithm();
        if (assertionOne) {
            System.out.println("Test Validated!");
            System.out.println("- The Answer of the exercise is: " + shouldReturnAnswerOfExercise());
            return;
        }
        System.out.println("Test Failed!");
    }

    private static boolean shouldReturnTwentyThreeAsResultFromAlgorithm() {
        final int ceillingNumber = 10;
        final int firstMultiple = 3;
        final int secondMultiple = 5;

        final int expectedSumResult = 23;

        final int sumMultiples = MultiplesSumCalculator.calculateSumMultiplesWithCeilling(
                ceillingNumber, firstMultiple, secondMultiple);

        if (expectedSumResult - sumMultiples == 0) {
            return true;
        }
        return false;
    }

    private static int shouldReturnAnswerOfExercise() {
        final int ceillingNumber = 1000;

        final int firstMultiple = 3;
        final int secondMultiple = 5;

        return MultiplesSumCalculator.calculateSumMultiplesWithCeilling(ceillingNumber, firstMultiple, secondMultiple);
    }

}