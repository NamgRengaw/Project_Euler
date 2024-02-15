package questions.question004LargestPalindromeProduct.test;

import questions.question004LargestPalindromeProduct.domain.PalindromeCalculator;

public class LargestPalindromeProductTest {

    public static void main(String... args) {
        boolean testValidated = shouldReturnNineteenHundredAndNineAsResult();
        if (testValidated) {
            System.out.println("- Test Validated!");
            System.out.println("- The answer is: " + shouldReturnAnswer());
            return;
        }
        System.out.println("- Test has failed!");
    }

    private static boolean shouldReturnNineteenHundredAndNineAsResult() {
        int numberOfDigits = 2;
        int answer = PalindromeCalculator.findLargestPalindromeFrom(numberOfDigits);
        if (answer == 9009) {
            return true;
        }
        return false;
    }

    private static int shouldReturnAnswer() {
        int numberOfDigits = 3;
        return PalindromeCalculator.findLargestPalindromeFrom(numberOfDigits);
    }

}
