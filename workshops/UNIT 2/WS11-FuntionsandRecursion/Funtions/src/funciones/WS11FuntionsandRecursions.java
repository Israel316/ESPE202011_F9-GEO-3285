/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class WS11FuntionsandRecursions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int operand1;
        int operand2;
        int showAddition;
        int showMultiplication;
        int top = 12;
        int showMultiplicationTables = 0;
        int product3;
        int showModule;
        float showDivisions = 0;
        int multiplier1 = 1;
        int multiplier2 = 1;


        do {
            Scanner input = new Scanner(System.in);
            System.out.println(" Enter operand1 ");
            operand1 = input.nextInt();
            System.out.println(" Enter operand2 ");
            operand2 = input.nextInt();


            if (operand1 % 2 == 0 && operand2 % 2 == 0) {
                showMultiplication = operand1 * operand2;
                System.out.println(" The product is " + showMultiplication);

            } else {

                if (operand1 % 3 == 0 && operand2 % 3 == 0) {
                    showAddition = operand1 + operand2;
                    System.out.println(" The sum is " + showAddition);

                } else {

                    if (operand1 % 7 == 0 && operand2 % 7 == 0) {
                        showModule = operand1 % operand2;
                        System.out.println(" The modul is " + showModule);
                    } else {

                        if (operand1 % 11 == 0 && operand2 % 11 == 0) {

                            if (operand1 != 0) {
                                System.out.println(" the table of --> " + operand1 + " <-- ");

                                for (int i = 1; multiplier1 <= top; multiplier1++) {
                                    showMultiplicationTables = operand1 * multiplier1;
                                    System.out.println(operand1 + " x " + multiplier1 + " = " + showMultiplicationTables);
                                }
                            }
                        }
                        multiplier1 = 1;

                        if (operand1 % 11 == 0 && operand2 % 11 == 0) {

                            if (operand2 != 0) {
                                System.out.println(" the table of --> " + operand2 + " <-- ");

                                for (int i = 1; multiplier2 <= top; multiplier2++) {
                                    product3 = operand2 * multiplier2;
                                    System.out.println(operand2 + " x " + multiplier2 + " = " + product3);
                                }
                            }

                            multiplier2 = 1;

                        } else {
                            if (operand1 % 13 == 0 && operand2 % 13 == 0) {
                                showDivisions = operand1 / operand2;

                                System.out.println("The quotient is " + showDivisions);
      

                            }
                        }
                        
                    }
                }
            }
        } while (operand1 > 0);
    }
}
    }
    
}
