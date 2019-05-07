/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;

public class Ejercicio12 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese x1 y y1");
        
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        
        System.out.println("Ingrese x2 y y2");
       
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();
        
        double a = Math.pow((x2 - x1), 2);
        double b = Math.pow((y2 - y1), 2);
        
        double d = Math.pow((a + b), 0.5);
        
        System.out.println("La distancia entre dos puntos es:" + d);
                
    }
    
}
