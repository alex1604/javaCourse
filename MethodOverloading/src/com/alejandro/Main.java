package com.alejandro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    calculateScore("Tim", 500);
	    calculateScore(100);
	    calculateScore();
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unknown player, unknown score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet >= 0 || (inches >= 0 && inches <= 12)) {

            double centimeters = (feet * 12) *2.54;
            centimeters += inches * 2.54;
            return centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to this many feet and inches " + feet + "." + remainingInches);
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            return -1;
        }
    }

}
