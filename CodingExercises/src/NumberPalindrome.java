public class NumberPalindrome {

    public static boolean isPalindrome (int number) {
        boolean result;
        if (number < -10){
            number *= -1;
        }

            int copy = number;
            int reverse = 0;

            do {
                int lastDigit = copy % 10;
                copy /= 10;
                reverse *= 10;
                reverse += lastDigit;
            } while (copy > 0);

            if (number == reverse) {
                result = true;
            } else {
                result = false;
            }

        return result;

    }

}
