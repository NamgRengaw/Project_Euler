package questions.question004LargestPalindromeProduct.domain;

public class PalindromeCalculator {

    public static int findLargestPalindromeFrom(int numberOfDigits) {

        String stringNumberRepeatedByNumberOfDigits = "9".repeat(numberOfDigits);
        int baseParsedNumber = Integer.parseInt(stringNumberRepeatedByNumberOfDigits);

        int largestProductNumber = 0;
        for (int i = baseParsedNumber; i >= 0; i--) {
            for (int j = baseParsedNumber; j >= 0; j--) {
                int product = i * j;
                int reverseProduct = reverseNumberViaString(product);

                if (product - reverseProduct == 0 && largestProductNumber < product) {
                    largestProductNumber = product;
                }
            }
        }

        return largestProductNumber;
    }

    public static int findProductBeetween(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static Integer reverseNumberViaString(Integer product) {
        String stringProduct = product.toString();
        String revertedString = "";

        for (int i = 0; i < stringProduct.length(); i++) {
            char character = stringProduct.charAt(i);
            revertedString = character + revertedString.toString();
        }

        return Integer.parseInt(revertedString);
    }

}
