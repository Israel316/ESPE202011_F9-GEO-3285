/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funtions;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Funtions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner (System.in);
        float gasolina;
        float litros;
        float pay;
        float distance;
        float time;
        litros = showCalculaterPaymentOfGasoline(entrada);
        showCalculateliters(entrada, litros);
       
        }

    public static void showCalculateliters(Scanner entrada, float litros) {
        float distance;
        float time;
        float gasoline;
        System.out.println("Calculate distance");
        System.out.println(" Enter Distance (km)");
        distance= entrada.nextFloat();
        System.out.println("Enter of time (hours)");
        time=entrada.nextFloat();
        gasoline=(float) ((litros*time)/1.25);
        System.out.println("Total of gasoline  in liters "+"" + gasoline);
    }

    public static float showCalculaterPaymentOfGasoline(Scanner entrada) {
        float litros;
        float distance;
        float pay;
        System.out.println("Operation of vehicle Santiago Arteaga");
        System.out.println("Enter of liters of gasoline");
        litros = entrada.nextFloat();
        System.out.println("Enter of distance (km)");
        distance= entrada.nextFloat();
        pay= (litros*distance);
        System.out.println("Total due "+" " + pay );
        return litros;
    }
    }