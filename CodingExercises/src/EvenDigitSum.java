public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {

        int result = 0;
        if (number < 0){
            result = -1;
        } else {
            while (number > 0) {
                int lastDigit = number % 10;
                if (number % 2 == 0) {
                    result += lastDigit;
                }
                number /= 10;
            }
        }
        return result;
    }
}
