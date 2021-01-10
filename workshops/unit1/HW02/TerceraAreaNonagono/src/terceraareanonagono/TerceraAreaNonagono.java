/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceraareanonagono;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TerceraAreaNonagono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    short perimetro;
    short apotema;
    short area;
    
    
    System.out.println("Ingrese el perimetro");
    perimetro= entrada.nextShort();
    System.out.println("Ingrese el apotema");
    apotema=entrada.nextShort();
    
    area=(short) ((perimetro* apotema)/2);
    
    
    
    System.out.println("El area del nonagono es "+""+ area);
    
    }
    
}
