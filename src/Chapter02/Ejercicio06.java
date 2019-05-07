/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;

public class Ejercicio06 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 0 y 1000");
        
        int numero = entrada.nextInt();
        
        int num1 = numero % 10;
        
        int Numero = (numero / 10) ;
        
        int num2 = Numero % 10;
        
        int NUmero = (Numero / 10) ;
        
        int num3 = NUmero % 10;
           
        
        int Suma = num1 + num2 + num3;
        
        System.out.println("la suma es:" + Suma);
        
        
                

    }
    
}
