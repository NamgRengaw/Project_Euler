package questions.question010SummationOfPrimes.test;

import questions.question010SummationOfPrimes.domain.SummationOfPrimesCalculator;

public class SummationOfPrimesTest {

    public static void main(String... args) {
        boolean testValidated = shouldReturnFithAndEightThousandAndThirtyTwoAsAnswer();
        if (testValidated) {
            System.out.println("- Test validated!");
            System.out.println("- The Answer is: " + shouldReturnAnswer());
            return;
        }
        System.out.println("- The test has failed!");
    }

    public static boolean shouldReturnFithAndEightThousandAndThirtyTwoAsAnswer() {
        final int ceilling = 10;
        long result = SummationOfPrimesCalculator
                .calculateSummationOfPrimesBelow(ceilling);
        if (result - 17 == 0) {
            return true;
        }
        return false;
    }

    public static long shouldReturnAnswer() {
        final int ceilling = 2_000_000;
        return SummationOfPrimesCalculator
                .calculateSummationOfPrimesBelow(ceilling);
    }
}
