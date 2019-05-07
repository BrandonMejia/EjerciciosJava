/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;

public class Ejercicio07 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar la v1, v2 y t");
        
        double v1 = entrada.nextDouble();
        
        double v2 = entrada.nextDouble();
        
        double t = entrada.nextDouble();
               
        double a = ( v2 - v1 ) / t;
        
        System.out.println("La aceleracion es:" + a);
        
        
    }
    
}
