/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funtionandrecursion;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FUNTIONandRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

             do {
            System.out.println(" *****Santiago Arteaga****");
            System.out.println("1. ->  Perimeter  ");
            System.out.println("2. -> Area of terrain  ");
            System.out.println("3. ->  Magnitude of seismic movement  ");
            System.out.println("4. ->  Tidal Range ");
            System.out.println("5. -> :( Exit :( ");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                   
                    double perimeter = countPerimeter(input);
                    
                    System.out.println(" Perimeter  --> " + perimeter);
                    break;
                
                case 2:
                    
                    double area = countArea(input);
                    
                    System.out.println(" Area of terrain -->" + area);
                    break;
               
                case 3:
                    
                    float magnitude = countMagnitude(input);
                    
                    System.out.println(" Magnitude of of seismic movement " + 
                            magnitude);
                    break;                                  
               
                case 4:
                    
                    float amplitude1 = countOceanWave(input);
                    
                    System.out.println(" Tidal Range " + amplitude1);
                    break;
               
                case 5:
                    
                    System.out.println(" thank good bye ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;                                         
            }
        } while (option != 5);
    }

    private static float countOceanWave(Scanner input) {
        float maximum;
        float minimun;
        float scope1;
        System.out.println(" Tallheight -> ");
        maximum = input.nextFloat();
        System.out.println(" Lowheight -> ");
        minimun = input.nextFloat();
        scope1= maximum - minimun;
        return scope1;
    }

    private static float countMagnitude(Scanner input) {
        float scope;
        float timechange;
        float magnitude;
        System.out.println(" Amplitude -> ");
        scope = input.nextFloat();
        System.out.println(" Time of varation -> ");
        timechange = input.nextFloat();
        magnitude = (float)(Math.log10(scope)+
                3 * Math.log10(8 * timechange)-2.85);
        return magnitude;
    }

    private static double countArea(Scanner input) {
        double equalLengths;
        double wide;
        double area;
        System.out.println(" Enter distances -> ");
        equalLengths = input.nextFloat();
        System.out.println(" Enter Bandwidth -> ");
        wide = input.nextFloat();
        area = equalLengths*wide ;
        return area;
    }

    private static double countPerimeter(Scanner input) {
        double number1;
        double number2;
        double number3;
        double perimeter;
        System.out.println(" Enter Side1 -> ");
        number1 = input.nextFloat();
        System.out.println(" Enter Side2 -> ");
        number2 = input.nextFloat();
        System.out.println(" Enter Side3 -> ");
        number3 = input.nextFloat();
        perimeter = number1 + number2 + number3;
        return perimeter;
    }
    
}
   