package org.fasttrackit;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Addition addition = new Addition();
        addition.sumCalc(10,13);
        System.out.println("Sum is " + addition.sumCalc(10,13) + ".");


        Substraction substraction = new Substraction();
        substraction.diffCalc(100,19);
        System.out.println("Difference between numbers is "+ substraction.diffCalc(100,19) + ".");

        Multiplication multiplication = new Multiplication();
        multiplication.prodCalc(12,2);
        System.out.println("The product is " + multiplication.prodCalc(12,2) + ".");

        Division division = new Division();
        division.divCalc(9,3);
        System.out.println("The division of numbers is " + division.divCalc(9,3) + ".");

        Remainer remainer = new Remainer();
        remainer.remCalc(7,2);
        System.out.println("Remainer of numbers is " + remainer.remCalc(7,2) + ".");

    }
}
