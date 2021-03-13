/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

/**
 *
 * @author HP
 */
public class BasicOperation {
    public static float addTwoNumbers(float addend1,float addend2){
        float sum=0;
        sum=addend1+addend2;
        return sum;
        
                
                
    }
        public static float subtractionTwoNumbers(float minuend,float subtrahend){
        float subtraction=0;
        subtraction=minuend-subtrahend;
        return subtraction;
        
}
        public static float multiplyTwoNumbers(float factor1,float factor2){
        float multiply=0;
        multiply=factor1*factor2;
        return multiply;
        }
          public static float divisionTwoNumbers(float dividend,float divisor){
        float division=0;
        division= dividend/divisor;
        return division;
          }
}