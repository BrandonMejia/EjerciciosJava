/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;

public class Ejercicio11 {

   
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar ahorros");
         
        double ahorros = entrada.nextDouble();
        
        double ahorros2 = (ahorros) * (1+ 0.00417);
        
        double ahorros3 = (ahorros + ahorros2) * (1+ 0.00417);
        
        double ahorros4 = (ahorros + ahorros3) * (1+ 0.00417);
        
        double ahorros5 = (ahorros + ahorros4) * (1+ 0.00417);
        
        double ahorros6 = (ahorros + ahorros5) * (1+ 0.00417);
        
        double ahorros7 = (ahorros + ahorros6) * (1+ 0.00417);
            
        System.out.println("Se ahorra en 6 meses:" + ahorros7);
     
 
    }
        
        
        
        
        
        
        
         
        
        
        
        
    }
    

