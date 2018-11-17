public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature) {
        boolean isPlaying;
        if (!summer && (temperature >= 25 && temperature <= 35)) {
            isPlaying = true;
        } else if (summer && (temperature >= 25 && temperature <= 45)){
            isPlaying = true;
        } else {
            isPlaying = false;
        }
        return isPlaying;
    }
}
