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
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double π=3.141619;
        double radio;
        System.out.println("Ingrese el radio");
        radio=entrada.nextDouble();
        double area = radio*radio*π;
        double perimetro = 2*radio*π;
        System.out.println("El area es:" +area);
        System.out.println("El perimetro es:" +perimetro);
        
    }
    
}
