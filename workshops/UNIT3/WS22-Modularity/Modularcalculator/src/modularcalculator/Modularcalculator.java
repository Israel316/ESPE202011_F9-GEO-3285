/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularcalculator;
import java.util.Scanner;
import utill.BasicOperation;
/**
 *
 * @author HP
 */
public class Modularcalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float addend1;
     float addend2;
     float result;
     Scanner imput=new Scanner(System.in);
        System.out.println("Enter two numbers");
        addend1=imput.nextFloat();
        addend2=imput.nextFloat();
        
        System.out.println("Addition");
        result=BasicOperation.addTwoNumbers(addend1,addend2);
        System.out.println(addend1 + "+" + addend2 + "=" + result );
        
         System.out.println("Subtraction");
        result=BasicOperation.subtractionTwoNumbers(addend1,addend2);
        System.out.println(addend1 + "-" + addend2 + "=" + result );
        
        System.out.println("Multiplication");
        result=BasicOperation.multiplyTwoNumbers(addend1,addend2);
        System.out.println(addend1 + "*" + addend2 + "=" + result );
        
        System.out.println("Divison");
        result=BasicOperation.divisionTwoNumbers(addend1,addend2);
        System.out.println(addend1 + "/" + addend2 + "=" + result );
        
        
    }
    
}
