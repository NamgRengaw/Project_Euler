package questions.question006SumSquareDifference.test;

import questions.question006SumSquareDifference.domain.SumSquareDifferenceCalculator;

public class SumSquareDifferenceTest {

    public static void main(String... args) {
        boolean testValidated = shouldReturnTwentyAndSixHundredAndFortyAsAnswer();
        if (testValidated) {
            System.out.println("- Test validated!");
            System.out.println("- The Answer is: " + shouldReturnAnswer());
            return;
        }
        System.out.println("- The test has failed!");
    }

    public static boolean shouldReturnTwentyAndSixHundredAndFortyAsAnswer() {
        int ceilling = 10;

        int result = SumSquareDifferenceCalculator.calculateSumSquareDifference(ceilling);
        if (result - 2640 == 0) {
            return true;
        }
        return false;
    }

    public static int shouldReturnAnswer() {
        int ceilling = 100;

        return SumSquareDifferenceCalculator.calculateSumSquareDifference(ceilling);
    }

}
