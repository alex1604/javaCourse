public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        // 1mB = 1024kB

        int megaBytes;
        float remainderKb;

        if (kiloBytes >= 0){

            megaBytes = kiloBytes / 1024;
            remainderKb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKb + " KB");
        } else {
            System.out.println("Invalid Value");
        }

    }
}
