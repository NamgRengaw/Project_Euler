package questions.question005smallestMultiple.test;

import questions.question005smallestMultiple.domain.SmallestMulipleCalculator;

public class SmallestMultipleTest {

    public static void main(String... args) {
        boolean testValidated = shouldReturnTwentyFiveHundredAndTwentyAsAnswer();
        if (testValidated) {
            System.out.println("- Test validated!");
            System.out.println("- The Answer is: " + shouldReturnAnswer());
            return;
        }
        System.out.println("- The test has failed!");
    }

    public static boolean shouldReturnTwentyFiveHundredAndTwentyAsAnswer() {
        int initialRange = 1;
        int finalRange = 10;

        int result = SmallestMulipleCalculator.calculateSmallestMultipleFrom(initialRange, finalRange);
        if (result - 2520 == 0) {
            return true;
        }
        return false;
    }

    public static int shouldReturnAnswer() {
        int initialRange = 1;
        int finalRange = 20;

        return SmallestMulipleCalculator.calculateSmallestMultipleFrom(initialRange, finalRange);
    }

}
