/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxdeclaration;
import java.util.Scanner;

/**
 *
 * @author HP
 */
import ec.edu.espe.Taxes.BasicTax;
public class TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float price;
       float totalPrice;
       float ivaValue;
       final float ivaPorcentage=12;
       
       Scanner input= new Scanner(System.in);
        System.out.println("Santiago Arteaga Taxes");
        System.out.println("IVA");
        System.out.println("Enter the price of your products");
        price=input.nextFloat();
        
        ivaValue=BasicTax.computeIva(price,ivaPorcentage);
        totalPrice=price+ivaValue;
        
        System.out.println("total price" + totalPrice );
        
        
        
    }
    
}
