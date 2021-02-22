/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctio;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Correctio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        int animalsWithWeight = 0;
        String[] animals;
        float[] weight;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Plase Enter the weight of animal->");
        animalsWithWeight = scanner.nextInt();

        animals = new String[animalsWithWeight];
        weight = new float[animalsWithWeight];

        for (int i = 0; i < animalsWithWeight; i++) {
            scanner.nextLine();
            System.out.println("Please Enter the name of animal #" + i + " ->");
            animals[i] = scanner.nextLine();
            System.out.println("Please enter " + animals[i] + "goals average ->");
            weight[i] = scanner.nextFloat();
        }

        System.out.println(" Animal -> \t   Weight  ");

        for (int i = 0; i < animalsWithWeight; i++) {
            System.out.println(animals[i] + " -> \t" + weight[i]);
        }

    }
}