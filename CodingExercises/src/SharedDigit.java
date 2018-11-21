public class SharedDigit {

    public static boolean hasSharedDigit (int first, int second) {
        boolean result = false;
        if (first <= 99 && first >= 10 && second <= 99 && second >= 10) {
            for (int i = 0; i < 2; i++) {
                int digit = first % 10;
                int secondCopy = second;
                first /= 10;
                for (int j = 0; j < 2; j++) {
                    if (digit == secondCopy % 10) {
                        result = true;
                    }
                    secondCopy /= 10;
                }
            }
        }
        return result;
    }
}
