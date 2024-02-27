package questions.question009SpecialPythagoreanTriplet.domain;

import java.lang.Math;

public class PythagoreanTripletCalculator {
    public static int calculatePythagoreanTripletWithCombinationResultingIn(int combinationResult) {
        int b = 0;
        while (true) {
            b++;
            for (int a = 0; a < b; a++) {
                double powC = Math.pow(a, 2) + Math.pow(b, 2);
                double c = Math.sqrt(powC);
                if ((a + b + c) == combinationResult) {
                    return ((Double) (a * b * c)).intValue();
                }
            }
        }
    }
}
