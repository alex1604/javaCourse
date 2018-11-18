public class NumberOfDaysInMonth {

//    public static boolean isLeapYear (int year) {
//        boolean leap = false;
//        if (year >= 1 && year <= 9999) {
//            int divisible4 = year % 4;
//            int divisible100 = year % 100;
//            int divisible400 = year % 400;
//
//            if (divisible4 == 0 && divisible100 != 0 || divisible400 == 0 ||
//                    divisible4 != 0 && divisible100 == 0 ) {
//                leap = true;
//            }
//        }
//        return leap;
//    }

    public static int getDaysInMonth (int month, int year) {

        boolean leapYear = LeapYearCalculator.isLeapYear(year);
        int days = 0;

        if (year >= 1 && year <= 9999) {

            switch (month){
                case 1:
                    days = 31;
                    break;
                case 2:
                    if (leapYear) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
                default:
                    days = -1;
                    break;
            }
        }
        return days;
    }
}
