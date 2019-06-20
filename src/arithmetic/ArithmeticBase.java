/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
public class ArithmeticBase 
{
  public double x,y;
    public double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for divison");
        System.out.println("Enter a number for result");
        int s= sc.nextInt();
        
        switch (s) 
        {
            case 1:
                return x + y;
            case 2:
                return x - y;
            case 3:
                return x * y;
            case 4:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        } 
     
    }
   
}
