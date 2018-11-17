package com.alejandro;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(4500));
    }

    public static String getDurationString (int seconds) {

        if (seconds >= 0){

            int minutes = seconds / 60;
            seconds %= 60;
            return getDurationString(minutes, seconds);

        } else {

            return "Invalid value";
        }
    }

    public static String getDurationString (int minutes, int seconds){

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

            int hoursFromMinutes = minutes / 60;
            minutes %= 60;
            return hoursFromMinutes + "h " + minutes + "m " + seconds + "s";
        } else {

            return "Invalid value";
        }
    }
}
