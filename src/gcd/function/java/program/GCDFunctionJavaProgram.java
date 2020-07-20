/*
    Student Name    :  Qi Cao
  
*/

package gcd.function.java.program;

import java.util.Scanner; // import Scanner class

public class GCDFunctionJavaProgram
{

    public static void main(String[] args)
    {
        //start
        // initalization
        int firstNumber = 0;
        int secondNumber = 0;

        // class-object-work
        Scanner input = new Scanner(System.in);
        //***** sequence *****
        System.out.println("Enter the First Number: ");
        // input
        firstNumber = input.nextInt();
        //***** sequence *****
        System.out.println("Enter the Second Number: ");
        // input
        secondNumber = input.nextInt();

        //***** sequence + call GCD funcion******
        System.out.println("The GCD is " + calcGCD(firstNumber, secondNumber));

    }// main

    //************************* wall*************
    // GCD function
    public static int calcGCD(int firstNumber, int secondNumber)
    {
        // while loop calculate GCD 
        while (firstNumber != secondNumber)
        {
            if (firstNumber > secondNumber)
            {
                firstNumber = firstNumber - secondNumber;
            } else
            {
                secondNumber = secondNumber - firstNumber;
            }

        }
        return (firstNumber);
    }// calcGCD

}// class
