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
public class Ejercicio14 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el balance anual:");
        int bal = entrada.nextInt();
        System.out.println("Ingrese la tasa de interes anual:");
        double Interes = entrada.nextDouble();
        
        double IntAn= (bal*(Interes/1200));
        
        System.out.println("El interes del siguiente mes es:" + IntAn);
        
    }
}
