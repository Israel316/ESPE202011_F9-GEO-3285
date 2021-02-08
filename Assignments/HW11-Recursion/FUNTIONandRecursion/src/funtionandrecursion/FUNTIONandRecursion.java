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
        
System.out.println("Santiago Arteaga");
    Scanner scanner = new Scanner (System.in);
    Scanner leer = new Scanner (System.in);
      int number1;
      int number2;
      int number3;
      int number4;   
      int number5;
      
    System.out.print("Enter the number1-->"); 
    number1 = scanner.nextInt (); 
    scanner.nextLine(); 
    System.out.print("Enter the number2-->"); 
    number2 = scanner.nextInt (); 
    scanner.nextLine();
    System.out.print("Enter the number3-->"); 
    number3 = scanner.nextInt (); 
    scanner.nextLine(); 
    System.out.print("Enter the number4-->"); 
    number4 = scanner.nextInt (); 
    scanner.nextLine();
    System.out.println("Enter the number5-->");  
    number5 = scanner.nextInt (); 
    scanner.nextLine();
    
System.out.println("factorialserires");
        FUNTIONandRecursion FUNTIONandRecursionobjfact = new FUNTIONandRecursion();
    System.out.println("The factorial of a number " + number1 + " using the recursive method-->" + objfact.Factorialcycle(number1));
System.out.println("Recursive Factorial");
    System.out.println("The factorial of a number " + number2 + " using the recursive method-->" + objfact.RecursiveFactorial(number2)); 
System.out.println("Recursive Sum ");
    System.out.println("The factorial of a number " + number3 + " using the recursive method-->" + objfact.RecursiveSum(number3));  
System.out.println(" Interactive Sum ");
    System.out.println("The factorial of a number " + number4 + " using the recursive method-->" + objfact.InteractiveSum(number4));
System.out.println("pyramid");
    System.out.println("java recursion example ");
    pyramid(8, "", "");
System.out.println("factorial");
    System.out.println("The factorial of " + number5 + " it is--> "+factorial(number5));
 System.out.println("Thank you come back soon"); 
   }

public static int RecursiveFactorial(int number2){
if (number2 < 0){
    return 0;
}else{
    if (number2 == 0){
 return 1;
}else{
 return number2 * RecursiveFactorial(number2-1);
}
}
}
public int factorialseries(int number1){
  int factor = 1;
    if (number1 < 0){
  return 0;
}else{
   while (number1 != 0){
   factor = number1 * factor;
   number1--;
}
  return factor;
}
}
public static int RecursiveSum(int number3){
   return (number3<=0)?0:number3 + RecursiveSum(number3-1);
}

public static int InteractiveSum(int number4){
  int result= 0;
   for(int i=1; i<=number4; i++){
   result +=i;
}
  return result;
}
public static void pyramid(int numero, String CadenaInicial, String CadenaActual){
   if (CadenaActual.length() == numero) {
     System.out.println(""+ CadenaActual);
}else{
     System.out.println(""+CadenaActual);
     CadenaActual = CadenaActual.concat(CadenaInicial);
     pyramid(numero, CadenaInicial, CadenaActual);
        }
    }
public static int factorial (int number5) {
  int factorial = 1; 
   for (int i = 1; i <= number5; i++) {
   factorial = factorial + i;
   }
   return factorial;
}
}
    
    