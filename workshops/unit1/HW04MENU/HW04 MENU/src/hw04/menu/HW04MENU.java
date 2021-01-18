/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04.menu;

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
    int option ;
    
    do{
        System.out.println("===Calculator of quadrilaterals===");
        System.out.println("1. ->area of ​​a square ");
        System.out.println("2. ->area of ​​a triangle ");
        System.out.println("3. ->area of ​​a rectangle");
        System.out.println("4. ->Exit");
    
    System.out.println("Enter your menu option --> ");
    option = input.nextInt();
    
     switch (option){
          
         case 1:
             int base;
             int height;
             int area;
           
             System.out.println("enter base -> ");
             base = input.nextInt();
             System.out.println("enter height-> ");
             height = input.nextInt();
             area = (base* height);
             System.out.println("The area is -->" + area);
             break;
         case 2:
             int baseB;
             int heightB;
             int areaB;
           
             System.out.println("enter base -> ");
             baseB = input.nextInt();
             System.out.println("enter height-> ");
             heightB = input.nextInt();
             areaB = (baseB* heightB);
             System.out.println("The area is -->" + areaB);
             
         case 3:
             int baseC;
             int heightC;
             int areaC;
           
             System.out.println("enter base -> ");
             baseC = input.nextInt();
             System.out.println("enter height-> ");
             heightC = input.nextInt();
             areaC = (baseC* heightC);
             System.out.println("The area is -->" + areaC);
             break;
         case 4:
             int baseD;
             int heightD;
             int areaD ;
           
             System.out.println("enter base -> ");
             baseD = input.nextInt();
             System.out.println("enter height-> ");
             heightD = input.nextInt();
             areaD = (baseD* heightD);
             System.out.println("The area is -->" + areaD);
             break;
         case 5:
             System.out.println("Good Bye my friend ");
             System.exit(0);
             break;
         default:
             System.out.println("Invalid option\n\n\n");
             break;
    
    
              }
           } while (option!= 5);
        }