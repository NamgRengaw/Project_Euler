package questions.question005smallestMultiple.domain;

public class SmallestMulipleCalculator {

    public static int calculateSmallestMultipleFrom(int initialRange, int finalRange) {

        int number = 0;
        boolean smallestMultipleNotFound = true;
        do {
            number++;
            for (int i = initialRange; i <= finalRange; i++) {
                if (number % i != 0) {
                    smallestMultipleNotFound = true;
                    break;
                }
                smallestMultipleNotFound = false;
            }
        } while (smallestMultipleNotFound);
        return number;
    }
}
