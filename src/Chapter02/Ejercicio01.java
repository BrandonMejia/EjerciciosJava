/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;


public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int ban=0;
        do{
            try{
                ban=0;
        System.out.println("Ingrese la temperatura en Celcius:");
        
        double Celsius = entrada.nextDouble();
        
        double Fahrenheit = ( 9.0 / 5 ) * Celsius + 32;
                
        System.out.println("La temperatura es:" + Fahrenheit);
            }catch(Exception e){System.out.println("Caracter no valido");ban=1;entrada.nextLine();}
        }while(ban!=0);
    }
}
