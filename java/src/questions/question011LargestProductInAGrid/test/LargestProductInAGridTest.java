package questions.question011LargestProductInAGrid.test;

import questions.question011LargestProductInAGrid.domain.LargestProductInAGridCalculator;

public class LargestProductInAGridTest {
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
        long result = LargestProductInAGridCalculator
                .calculateSummationOfPrimesUsingSieveOfEratosthenes(ceilling);
        if (result - 17 == 0) {
            return true;
        }
        return false;
    }

    public static long shouldReturnAnswer() {
        final int ceilling = 2_000_000;
        return LargestProductInAGridCalculator
                .calculateSummationOfPrimesUsingSieveOfEratosthenes(ceilling);
    }
}
