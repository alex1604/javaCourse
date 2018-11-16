package com.alejandro;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the highest score!");

        if (topScore >= 100)
            System.out.println("You got the highest score!");

        if (topScore < 100)
            System.out.println("You didn't get the highest score!");

        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90 || (secondTopScore <= 90)))
            System.out.println("One of these tests is true");

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar = " + wasCar);

        // Challenge:
        
    }
}
