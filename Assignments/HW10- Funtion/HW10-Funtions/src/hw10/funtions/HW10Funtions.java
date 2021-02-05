/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.funtions;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class HW10Funtions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int dividend; 
        int divisor = 0;
        float quotient;
        int Number1 = 0;
        int Number2= 0;
        int table=0;
        int stop=0;
        int product=0;
           
        System.out.println(" ^^^^___Santiago Arteaga Funtions___^^^^^ ");
  
    System.out.println("  ***** Enter the dividend*****  ");
        dividend=input.nextInt ();
    System.out.println("    enter the  divisor   ");
    quotient = divideTwoNumbers(dividend, divisor);
    System.out.println(" THE RESULT " + dividend + " and " + divisor + " is -> " + quotient); 
    
    System.out.println("  ****Write the first number****");
    Number1=input.nextInt (); 
    Number2 = computeSquare(Number1);
    System.out.println("Number2 value: " + Number1 + " ^2-->" + Number2);
    
    System.out.println("   ****Write the first number****  ");
    Number1=input.nextInt ();     
    Number2 = computeSquare(Number1);
    System.out.println("Number2 : " + Number1 + " ^2-->" + Number2);    
    System.out.println("  ****Write the first number**** ");
    Number1=input.nextInt ();
    Number2 = computeSquare(Number1);
    System.out.println("the number square of -> " + Number1 + " <- = -> " + Number2);
      
    System.out.println(" ****Write the first number****");
    Number1=input.nextInt (); 
    Number2 =(Number1);
    System.out.println("Number2 : Number2 = " + Number1 + " * " 
            + Number1 + " + 2 * " + Number1 + " + 1-> Number2 = " + Number2);

    System.out.println("****Write the number of stop**** ");
    stop=input.nextInt ();
    System.out.println(" ****Write the number of table****");
    table=input.nextInt ();   
    
    
    for (int j = 1 ; j <= stop ; j ++){
    product = table * j;
    System.out.println(+ table + " * " + j + " = " + product);
    }

     System.out.println("  **** Take care and come back****     "); 
 
    
    }
    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        //             5        10   -> 0.5
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int computeSquare(int Number1) {
        
        int Number2 = 0;
        Number2 = Number1 * Number1;

        return Number2;
    }

    public static int computeParabola(int number1) {
     
        int number2 = 0;
        number2 = number1 * number1 + 2 * number1 + 1;

        return number2;
    }
     public static int showTheMultiplicationTable() {   
  
    System.out.println("The multiplication tables: ");
   
    
    int top=0;
    int product=0;
    int table=0;
    for (int j = 1 ; j <= top ; j ++){
    product = table * j;
    System.out.println( + table + " * " + j + " = " + product);
   
      
     } 
         return +product;
}
}
    

