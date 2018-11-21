public class FirstLastDigitSum {


    public static int sumFirstAndLastDigit (int number) {

        int result;
        if (number < 0){
            result = -1;
        } else {

            int copy = number;
            result = copy % 10;
            int lastDigit;
            do {
                lastDigit = copy % 10;
                copy /= 10;

            } while (copy > 0);

            result += lastDigit;

        }
        return result;
    }
}

