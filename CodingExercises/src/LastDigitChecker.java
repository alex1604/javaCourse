public class LastDigitChecker {

    public static boolean hasSameLastDigit (int first, int second, int third) {
        boolean result;
        if (first < 10 || second < 10 || third < 10){
            result = false;
        } else if (first > 1000  || second > 1000 || third > 1000){
            result = false;
        } else {
                result = (first % 10 == second % 10) || (first % 10 == third % 10)
                        || (second % 10 == third % 10) ? true : false;
        }
        return result;
    }
}
