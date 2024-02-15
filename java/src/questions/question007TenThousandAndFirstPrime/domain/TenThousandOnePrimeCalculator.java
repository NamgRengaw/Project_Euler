package questions.question007TenThousandAndFirstPrime.domain;

public class TenThousandOnePrimeCalculator {

    public static long calculateTenThousandOnePrime(int ceilling) {

        int primeCounter = 0;
        long numberCounter = 1;
        while (primeCounter - ceilling != 0) {
            numberCounter++;
            int internalCounter = 0;
            for (int i = 1; i <= numberCounter; i++) {
                if (numberCounter % i == 0) {
                    internalCounter++;
                    if (internalCounter > 2) {
                        break;
                    }
                }
            }
            if (internalCounter == 2) {
                primeCounter++;
            }
        }

        return numberCounter;
    }

}
