public class BarkingDog {

    public static boolean bark (boolean barking, int hourOfDay) {
        boolean wakeUp = false;

        if (hourOfDay < 0 || hourOfDay > 23) {
            wakeUp = false;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking){
            wakeUp = true;
        }
        return wakeUp;
    }
}
