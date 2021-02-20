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
        

        String[] typesOfMatrices = {"Null", "scalar","identity","symmetrical","square"};

        String[] valueOfMatrices = {"3x3", "2x2", "4x4"};
        
        String[] operationsWithMatrices = {"additions", "subtraction", "multiplicated"};
        

        System.out.println("Types of Matrices");
        for (String typesOfMatricess : typesOfMatrices) {
            System.out.println("Types of Matrices -->  " + typesOfMatricess);
        }

        System.out.println("");
        System.out.println("value of matrices");
        for (String valueOfMatricess : valueOfMatrices) {
            System.out.println("value of matricess -->  " + valueOfMatricess);
        }
        System.out.println("operations with Matrices");
        for (String operationsWithMatricess :operationsWithMatrices ) {
            System.out.println("ground Transportation Mean -->  " + operationsWithMatricess);
    }

 }
}