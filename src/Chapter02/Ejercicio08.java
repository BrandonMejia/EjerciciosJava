/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;


public class Ejercicio08 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar velocidad y aceleracion");
        
        double velocidad = entrada.nextDouble();
        double aceleracion = entrada.nextDouble();
        
        double distancia = ( velocidad * velocidad ) / (2*aceleracion);
        
        System.out.println("La distancia obtenida es:" + distancia);
        
       
    }
    
}
