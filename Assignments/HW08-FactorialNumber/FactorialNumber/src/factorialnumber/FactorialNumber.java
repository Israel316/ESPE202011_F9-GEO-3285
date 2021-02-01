/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialnumber;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int factorial= 1;
        int number = 0;
        int stop=15;
        int product =0;
        
                do{
            
         System.out.println("ENTER A NUMBER EQUAL TO FACTORIAL: ");
         System.out.println("NEGATIVE NUMBERS to exit  --> ");
         System.out.println("NUMBER GREATER THAN 15 EQUALS ERROR--> to exit  ");
         
         Scanner input=new Scanner (System.in);
         number=input.nextInt();
         
         factorial=1;
         while(number !=0)
         {
             factorial *=number;
              number --;       
         }
        System.out.println("the factorial number is "  +  factorial);
        
    }while (factorial !=0);
    number  = -0;
    System.out.println("good bye");
} 

}
    
    

