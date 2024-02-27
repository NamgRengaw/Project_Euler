package questions.question009SpecialPythagoreanTriplet.test;

import questions.question009SpecialPythagoreanTriplet.domain.PythagoreanTripletCalculator;

public class PythagoreanTripletTest {
    public static void main(String... args) {
        boolean testValidated = shouldReturnSixtyAsAnswer();
        if (testValidated) {
            System.out.println("- Test validated!");
            System.out.println("- The Answer is: " + shouldReturnAnswer());
            return;
        }
        System.out.println("- The test has failed!");
    }

    public static boolean shouldReturnSixtyAsAnswer() {
        final int combinationResult = 12;
        int result = PythagoreanTripletCalculator
                .calculatePythagoreanTripletWithCombinationResultingIn(combinationResult);
        if (result - 60 == 0) {
            return true;
        }
        return false;
    }

    public static int shouldReturnAnswer() {
        final int combinationResult = 1000;
        return PythagoreanTripletCalculator
                .calculatePythagoreanTripletWithCombinationResultingIn(combinationResult);
    }
}
