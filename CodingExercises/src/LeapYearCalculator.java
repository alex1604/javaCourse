public class LeapYearCalculator {

    public static boolean isLeapYear (int year) {
        boolean leap = false;
        if (year >= 1 && year <= 9999) {
            int divisible4 = year % 4;
            int divisible100 = year % 100;
            int divisible400 = year % 400;

            if (divisible4 == 0 && divisible100 != 0 || divisible400 == 0 ||
                    divisible4 != 0 && divisible100 == 0 ) {
                leap = true;
            }
        }
        return leap;
    }
}

