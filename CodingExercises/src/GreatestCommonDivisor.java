public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {
        int result = 1;
        int biggest;
        int smallest;
        if (first < 10 || second < 10){
          result = -1;
        } else {
            if (first > second) {
                biggest = first;
                smallest = second;
            } else {
                biggest = second;
                smallest = first;
            }
            for (int i = 1; i <= biggest; i++) {
                if (biggest % i == 0) {
                    if (smallest % i == 0) {
                        result = i;
                    }
                }
            }
        }
        return result;
    }
}
