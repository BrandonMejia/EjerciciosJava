/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;

public class Ejercicio10 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar el lado del hexagono");
        
        double lado = entrada.nextDouble();
        
        double area = ( 3 * (Math.pow(3, 0.5 ))/2) * Math.pow(lado,2);
        
        System.out.println("El area es:" + area);
    }
    
}
