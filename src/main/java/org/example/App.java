/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */


package org.example;


import java.util.Scanner;


public class App
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        double ratio = 0;

        System.out.print( "Enter a 1 if you are a male or a 2 if you are female: " );
        int gender = input.nextInt();
        if (gender == 1){
            ratio = 0.73;
        }
        else if (gender == 2){
            ratio = 0.66;
        }

        System.out.print( "How many ounces of alcohol did you have? " );
        double alcohol = input.nextDouble();
        System.out.print( "What is your weight in pounds? " );
        double weight = input.nextDouble();
        System.out.print( "How many hours has it been since your last drink? " );
        double hours = input.nextDouble();

        double BAC = (alcohol * 5.14/weight * ratio) - (0.015 * hours);

        System.out.printf("Your BAC is %.6f\n", BAC);

        System.out.print("It is " + (BAC>=0.08 ? "not " : "") + "legal for you to drive.");


    }
}
