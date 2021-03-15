/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declaration;

import ec.edu.epe.operationMatrix.matrixBasic;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DECLARATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int m = 0;
     int n = 0;
     int a[][] = new int [3] [3];
     int b[][] = new int [3][3];
     int c[][]= new int [3] [3];
     
     Scanner input=new Scanner (System.in);
     
        System.out.println("Santiago Arteaga MatrixLibraries*");
        
        System.out.println("Enter the matrix dimensions");
        
        System.out.println("Enter the number of columns(m)");
        m=input.nextInt();
        
        System.out.println("Enter the number of rows(n)");
        n=input.nextInt();
        
        System.out.println("Enter the number of the Matrix A");
        a=readMatrix(m,n,a,input);
        
        System.out.println("Enter the number of the Matrix B");
        b=readMatrix(m,n,a,input);
        
       System.out.println("The subtraction of matrix A snd matrix B is equal to");
        c=matrixBasic.subtractionTheMatrices( m, n,a,b,c);
        System.out.println("");
        
       System.out.println("The multiplication of matrix A snd matrix B is equal to");
        c=matrixBasic.multiplicationTheMatrices( m, n,a,b,c);
        System.out.println("");
        
    }
  public static int[][] readMatrixA(int m, int n, int[][] a, Scanner input) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
                System.out.print("\t " + a[i][j]);
            }
        }
        return a;
    }

    public static int[][] readMatrixB(int m, int n, int[][] b, Scanner input) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                b[i][j] = input.nextInt();
                System.out.print("\t " + b[i][j]);
            }
        }
        return b;

    }

    private static int[][] readMatrix(int m, int n, int[][] a, Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}