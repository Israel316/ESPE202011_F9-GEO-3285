/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areanonagono;
import java.util.Scanner;
/**
 *
 * @author HP SANTIAGO ARTEAGA
 */
public class AREANONAGONO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada de datos, salida de datos
        Scanner entrada = new Scanner (System.in);
        float perimetro;
        float apotema;
        float area;
        
        System.out.println("Ingrese el perimetro");
        perimetro = entrada.nextFloat();
        System.out.println("Ingrese el apotema");
        apotema = entrada.nextFloat();
        
        area= (perimetro*apotema)/2;
        System.out.println("El area del nonagono es"+" " + area  );

      
        
        
    }
    
}
