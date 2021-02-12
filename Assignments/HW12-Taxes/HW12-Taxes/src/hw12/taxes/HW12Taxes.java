/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.taxes;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;   
        System.out.println("Calculator Santiago Arteaga");
      
        
        do {
            System.out.println(" 1.- Income tax ");
            System.out.println(" 2.- VAT tax ");
            System.out.println(" 3.- Foreign exchange tax");
            System.out.println("0.- Exit ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    int rest;
                    float taxIncome;
                    float porcent;
                    int value;
                    System.out.println("  Aggregate tax ");
                    System.out.println(" Enter the amount to calculate ");
                    System.out.print(" To be paid ");                    
                    value = input.nextInt();
                    taxIncome = showIncomeTax(value);
                    System.out.println(" The value of the vat is -> " + taxIncome );
                    break;
                case 2:
                    float value2;
                    float taxIVA;
                    float iva;
                    System.out.println("Aggregate tax ");
                    System.out.println("Enter the amount to calculate ");
                    System.out.print(" To be paid ");
                    value2 = input.nextInt();
                    showIVA(value2);
                    break;
                case 3:
                    float value3;
                    float taxISD;
                    System.out.println("Outgoing Foreign Exchange Tax");
                    System.out.println(" Enter the value to be calculated ");
                    System.out.print("To be paid ");
                    value3 = input.nextInt();
                    taxISD = showISD(value3);
                    System.out.println(" The total value is ->  " + taxISD );
                    break;
            }
        } while (option != 0);
        System.out.println(" Thanks ");
    }
    private static float showISD(float value) {
        float tax;
        if (value > 1200) {
            tax = (float) (value * 0.05);
            return tax;
        }
        return 0;
    }

    private static void showIVA(float value) {
        float iva;
        float taxIVA;
        iva = (float) (value * 0.12);
        taxIVA = value - iva;
        System.out.println(" The vat is ->  " + iva);
        System.out.println("The price of the product  " + taxIVA );
    }

    private static float showIncomeTax(int value) {
        int rest;
        float porcent;
        float tax;
        if (value > 11212 && value < 14285) {
            rest = (value - 11212);
            porcent = (float) (rest * 0.05);
            tax = porcent;
            return tax;
        } else {
            if (value > 14285 && value < 17854) {
                rest = (value - 14285);
                porcent = (float) (rest * 0.1);
                tax = porcent + 154;
                return tax;
            } else {
                if (value > 17854 && value < 21442) {
                    rest = (value - 17854);
                    porcent = (float) (rest * 0.12);
                    tax = porcent + 511;
                    return tax;
                } else {
                    if (value > 21442 && value < 42874) {
                        rest = value - 21442;
                        porcent = (float) (rest * 0.15);
                        tax = porcent + 941;
                        return tax;
                    } else {
                        if (value > 42874 && value < 64297) {
                            rest = value - 42874;
                            porcent = (float) (rest * 0.2);
                            tax = porcent + 4156;
                            return tax;
                        } else {
                            if (value > 64297 && value < 85729) {
                                rest = value - 64297;
                                porcent = (float) (rest * 0.25);
                                tax = porcent + 8440;
                                return tax;
                            
                                    }
                                }
                            }
                        }
            
        return 0;
    }
}