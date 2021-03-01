/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typesofmatrices;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Typesofmatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        String[] typesOfMeasure = {"Decimeters", "Meters","Decameters","Hectometers","Kilometers"};

        String[] valueInCentimeter = {"10cm", "100cm", "1000cm", "10000cm", "100000cm"};
        
       
        

        System.out.println("Types of Measure");
        for (String typesOfMeasures : typesOfMeasure) {
            System.out.println("Types of Measure -->  " + typesOfMeasures);
        }

        System.out.println("");
        System.out.println("value in Centimeter");
        for (String valueInCentimeters : valueInCentimeter) {
            System.out.println("value in Centimeter-->  " + valueInCentimeters);
        }
        
    }

 }
