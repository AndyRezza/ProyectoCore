/*
 * PROGRAMA QUE CALCULA EL AREA DE UN CILINDRO
 * and open the template in the editor.
 */
package areacilindro;

import java.util.Scanner;

/**
 *
 * @author shaoran
 */
public class AreaCilindro {
    
   public static void main(String[] args){
    //El valor del numero pi
    double PI = 3.1415926536;
    double radio;
    double altura;    
    Scanner teclado  = new Scanner(System.in);    
    System.out.println("introdusca los datos del cilindro:");
    System.out.println("Radio:  ");
    radio = teclado.nextDouble();
    System.out.println("Altura: ");
    altura = teclado.nextDouble();
    System.out.println("el area del cilindro es: ");
    System.out.println(PI*radio*radio*altura);
    }
}
