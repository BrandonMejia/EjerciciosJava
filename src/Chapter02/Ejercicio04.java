/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;

public class Ejercicio04 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la masa en kilogramos");
        
        double kilogramos = entrada.nextDouble();
        
        double libras = kilogramos * 0.454;
        
        System.out.println("La masa en libras es:" +libras);
    }
    
}
