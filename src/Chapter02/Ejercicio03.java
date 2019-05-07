/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Scanner;


public class Ejercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int ban=0;
        double pies;
        do{
            try{
                ban=0;
        System.out.println("Ingrese la medida en pies:");
        pies = entrada.nextDouble();
        double metros = pies / 0.305;
        System.out.println("La medida en pies es:" + metros);
            }catch(Exception e){System.out.println("Caracter no valido");ban=1;entrada.nextLine();}
        }while(ban!=0);
    }
    
}
