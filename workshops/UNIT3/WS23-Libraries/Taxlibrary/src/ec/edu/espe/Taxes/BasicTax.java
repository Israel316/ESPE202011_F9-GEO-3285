/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Taxes;

/**
 *
 * @author HP
 */
public class BasicTax {
    public static float computeIva(float basePrice, float porcentageValue){
    float iva;
    iva=basePrice *porcentageValue /100;
    return iva;
    
}
}
