/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

/**
 *
 * @author HP
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejercicio con bucle ");
         {
         int t;
         t=1;
         int top=5;
        for (int x=1 ; x<=top ; x++ ){
            System.out.println( "Aprobado el semestre\n");
             int line = 0;
            line++;
           
        }
           int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 5 ====");

        while (i < 5) {
            System.out.println("i -> " + (i + 1));
            //i += 1;
            i++;
            //i = i + 1;
    }
    

      System.out.println("Multiplication Tables : 5");
        int top=12;
        int product=0;
        int table = 5;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("5 * " + j + " = " + product);
        }
    
        
    }
   
    
}
