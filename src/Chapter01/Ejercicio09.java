/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double largo, ancho;
        System.out.println("Ingresar el largo del rectangulo:");
        largo = entrada.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo:");
        ancho = entrada.nextDouble();
        double area = largo*ancho;
        System.out.println("El area obtenida es: "+area);
    }
    
}
