/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaareanonagono;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class SegundaAreaNonagono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // entrada de datos,salida de datos
        int perimetro;
        int apotema;
        int area;
     
     Scanner entrada= new Scanner(System.in);
     System.out.println( "Ingrese el perimetro");
     perimetro= entrada.nextInt();
     System.out.println("Ingrese el apotema");
     apotema=entrada.nextInt();
     
     area=(perimetro*apotema)/2;
     System.out.println("El area del nonagono es"+"" + area);
     
     
    }
    
}
