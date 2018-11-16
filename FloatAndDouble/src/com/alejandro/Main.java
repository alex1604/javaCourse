package com.alejandro;

public class Main {

    public static void main(String[] args) {

        //the width of an integer is 32
	    int myIntValue = 5 / 6;
        //the float of an integer is 32
	    float myFloatValue = 5f / 2f;
        //the double of an integer is 32
	    double myDoubleValue = 5d / 2d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        double myValueInPounds = 200d;
        double result;

        result = myValueInPounds * 0.45359237d;
        System.out.println("200 pounds becomes " + result + " kg");

    }
}
