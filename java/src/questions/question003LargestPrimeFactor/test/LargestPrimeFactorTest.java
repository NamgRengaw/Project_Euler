package questions.question003LargestPrimeFactor.test;

import questions.question003LargestPrimeFactor.domain.LargestPrimeFactorCalculator;

public class LargestPrimeFactorTest {

    public static void main(String... args) {
        boolean assertion = shouldReturnTwentyNineAsResult();
        if (assertion) {
            System.out.println("- The Test was validated!");
            System.out.println("- The result is : " + shouldReturnAnswer());
            return;
        }
        System.out.println("- The Test has failed!");
    }

    private static boolean shouldReturnTwentyNineAsResult() {
        final Long assertionNumber = 13_195L;
        Long result = LargestPrimeFactorCalculator.calculateLargestPrimeFactorFrom(assertionNumber);
        if (result == 29) {
            return true;
        }
        return false;
    }

    private static long shouldReturnAnswer() {
        final long questionNumber = 600_851_475_143L;
        return LargestPrimeFactorCalculator.calculateLargestPrimeFactorFrom(questionNumber);
    }

}
