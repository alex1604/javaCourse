public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces (double param1, double param2) {
        System.out.println(param1 + " / " + param2);
//        boolean areEqual = false;
        int intPartParam1 = (int) param1;
        int intPartParam2 = (int) param2;
        System.out.println(intPartParam1 + " / " + intPartParam2);

        if (intPartParam1 == intPartParam2){
            param1 *= 1000;
            param2 *= 1000;

            int result = (int) param1 - (int) param2;
            System.out.println(result);

            if (result != 0){
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
