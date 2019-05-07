/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;

public class Ejercicio09 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int ban=0;
        double masa, temperaturainicial, temperaturafinal;
        do{
            try{
                ban=0;

        System.out.println("Ingresar la masa del agua en kilogramos:");
        
        masa = entrada.nextDouble();
        
        System.out.println("Ingresar la temperatura inicial:");
        
        temperaturainicial = entrada.nextDouble();
        
        System.out.println("Ingrese la temperatura final:");
        
        temperaturafinal = entrada.nextDouble();
        
        double energia = masa * ( temperaturafinal - temperaturainicial ) * 4184;
        
        System.out.println("La energia requerida es:" + energia);
        }catch(Exception e){System.out.println("Caracter no valido");ban=1;entrada.nextLine();}
        }while(ban!=0);
}
}
