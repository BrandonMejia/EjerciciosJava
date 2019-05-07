/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;
        
        
public class Ejercicio05 {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de minutos");
        
        double minutos = entrada.nextDouble();
        
        double años = minutos / 365;
        
        System.out.println("En años es aproximadamente" +años);
    }
    
}
