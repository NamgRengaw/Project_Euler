package questions.question007TenThousandAndFirstPrime.test;

import questions.question007TenThousandAndFirstPrime.domain.TenThousandOnePrimeCalculator;

public class TenThousandOnePrimeTest {

    public static void main(String... args) {
        boolean testValidated = shouldReturnThirteenAsAnswer();
        if (testValidated) {
            System.out.println("- Test validated!");
            System.out.println("- The Answer is: " + shouldReturnAnswer());
            return;
        }
        System.out.println("- The test has failed!");
    }

    public static boolean shouldReturnThirteenAsAnswer() {
        int ceilling = 6;

        long result = TenThousandOnePrimeCalculator.calculateTenThousandOnePrime(ceilling);
        if (result - 13 == 0) {
            return true;
        }
        return false;
    }

    public static long shouldReturnAnswer() {
        int ceilling = 10001;

        return TenThousandOnePrimeCalculator.calculateTenThousandOnePrime(ceilling);
    }

}
