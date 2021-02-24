/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixoperation;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("          Santiago Artega        ");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        int[][] MatrizA = new int[3][3];
        int[][] MatrizB = new int[3][3];
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter matrix A values:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Row " + (i + 1) + " Column " + (j + 1) + " = ");
                MatrizA[i][j] = scanner.nextInt();
            }
            System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        }

        System.out.println("enter matrix B values:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
                
                
                
                System.out.print("Row " + (i + 1) + " Column " + (j + 1) + " = ");
                MatrizB[i][j] = scanner.nextInt();
            }
            System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        }

        System.out.println("enter matrix:");

        System.out.println("");
        System.out.println("MATRIX A");
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(MatrizA[i][j] + " ");

                if (j == 2) {
                    System.out.println("");
                }
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
            }
        }
        System.out.println("MATRIX B");
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(MatrizB[i][j] + " ");

                if (j == 2) {
                    System.out.println("");
                }
            System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
            }
           
        }

        System.out.println("the subtraction matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((MatrizA[i][j] - MatrizB[i][j]) < 10) {
                    System.out.print(MatrizA[i][j] - MatrizB[i][j] + "  ");
                } else {
                    System.out.print(MatrizA[i][j] - MatrizB[i][j] + " ");
                }
                if (j == 2) {
                    System.out.println("");
                }

            }
        }
    }

}
        
