/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a,b;
        System.out.println("Ingresar el subtotal:");
        a=entrada.nextInt();
        System.out.println("Ingresar la tasa de interes:");
        b=entrada.nextInt();
        
        int Interes=a*b/100;
        int Total = a + Interes;
        System.out.println("El interes es" +Interes+ "y el Total es" +Total);
        
        
    }
}
