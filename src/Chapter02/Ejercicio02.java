/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;


public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el radio y la altura");
        
        double radio = entrada.nextDouble();
        
        double altura = entrada.nextDouble();
        
        double area = radio * radio * 3.14159;
        
        double volumen = area * altura;
        
        System.out.println("El area es:" + area);
        
        System.out.println("El volumen es:" + volumen);
        
    }






}
