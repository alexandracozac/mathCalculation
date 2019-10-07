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
        addition.sumCalc(10,10.5,2.2);
        System.out.println("First sum is " + addition.sumCalc(10,13) + " and the second sum is " + addition.sumCalc(10,10.5,2.2) + ".");


        Substraction substraction = new Substraction();
        substraction.diffCalc(100,19);
        substraction.diffCalc(20,2.72,9.99);
        System.out.println("Difference 1 between numbers is " + substraction.diffCalc(100,19) + " and difference 2 is " + substraction.diffCalc(20,2.72,9.99) + ".");

        Multiplication multiplication = new Multiplication();
        multiplication.prodCalc(12,2);
        multiplication.prodCalc(2.5,3,4.02);
        System.out.println("The product 1 is " + multiplication.prodCalc(12,2) + " and the product 2 is " + multiplication.prodCalc(2.5,3,4.02) + ".");

        Division division = new Division();
        division.divCalc(9,3);
        division.divCalc(20.4,2.3,1.2);
        System.out.println("The division 1 of numbers is " + division.divCalc(9,3) + " and division 2 is " + division.divCalc(20.4,2.3,1.2) + ".");

        Remainer remainer = new Remainer();
        remainer.remCalc(7,2);
        remainer.remCalc(10,2.7,0.5);
        System.out.println("Remainer of first numbers is " + remainer.remCalc(7,2) + " and remainer of the last numbers is " + remainer.remCalc(10,2.7,0.5) + ".");

    }
}
