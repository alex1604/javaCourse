public class FactorPrinter {

    public static void printFactors (int number) {
        if (number < 1){
            System.out.println("Invalid Value");
        } else {
            String result = "";

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    result += i + " ";
                }
            }
            System.out.println(result);
        }
    }
}
