/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperation;

/**
 *
 * @author HP
 */
public class BasicOperation {
    private static int addend;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int multiplying;
        int multiplier;
        
        int dividend;
        int divisor;
        
        int dividendA;
        int dividendB;
        
        int dividendA= 80;
        int divisorB= 5;
        
        dividend= 35;
        divisor=5;
        
        multiplying= 8;
        multiplier=7;
        
        minuend=-23;
        subtrahend= -6;
        //-2-(-6)= -23 + 6= -17
        //initilizacion
        addend1= 5;
        addend2=18;
        //Operation
        
        sum= addend1+addend2;
        
        System.out.println("the addiction of" + addend1 + " + " + addend2 + "is equal to -->"+ sum);
        
        ++sum;
        System.out.println("sum is equal to -->" + sum);
        
        sum++;
        System.out.println("sum us equal to -->" + sum);
        System.out.println("adding one to sum" + (sum++));
        System.out.println("ading one to sum"+((++sum)));
        System.out.println("the subtration of" + minuend + "-" +subtrahend + "is equal to" + (minuend- subtrahend));
        System.out.println("the subtration of" + multiplying + "*" + multiplier + "is equal to" + (multiplying*multiplier));
        System.out.println("the division of" + dividend + "/" + divisor + "is aqual to" + (dividend/divisor));
        System.out.println("the modulus of" + dividendA +"%"+ divisorB + "is equal to" + (dividendA % divisorB));
        
        
             
    }
    
}
