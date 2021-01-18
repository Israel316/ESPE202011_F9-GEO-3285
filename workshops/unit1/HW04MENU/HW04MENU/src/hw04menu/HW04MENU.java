/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menu;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class HW04MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> trapeze");
            System.out.println("2. -> rhombus");
            System.out.println("3. -> square");
            System.out.println("4. -> exit");
          

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int addend1;
                    int addend2;
                    int addend3 = 0;
                    int mult;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    mult = (addend1 + addend2)/addend3;
                    System.out.println(" the sum is --> " + mult);
                    break;
                case 2:
                    System.out.println("Area of trapeze is");
                    break;
                case 3:
                    System.out.println("Area de rhombus is");
                    break;
                case 4:
                    System.out.println("Area of square");
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}
    

