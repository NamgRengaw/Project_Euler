package questions.question006SumSquareDifference.domain;

public class SumSquareDifferenceCalculator {

    public static int calculateSumSquareDifference(int ceilling) {

        int sumSquareNumbers = 0;
        int sumNaturalNumbers = 0;
        for (int i = 1; i <= ceilling; i++) {
            sumNaturalNumbers += i;
            sumSquareNumbers += Math.pow(i, 2);
        }
        int sumSquareRoot = (int) Math.pow(sumNaturalNumbers, 2);

        return sumSquareRoot - sumSquareNumbers;
    }

}
