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
        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that display a message "Total was over the limit"
        //      if the remainding total (#4) is equal to 20 or less.

        double myDouble = 20d;
        double mySecondDouble = 80d;
        double result = (myDouble + mySecondDouble) * 25;
        double remainder = result % 40;
        System.out.println(remainder);
        if (remainder >= 20)
            System.out.println("Total was over the limit");
    }
}
