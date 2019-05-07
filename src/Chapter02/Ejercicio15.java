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
public class Ejercicio15 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int Capital, año;
        double tasaMensual;
        System.out.println("Ingresar Capital:");
        Capital = entrada.nextInt();
        System.out.println("Ingrese tasa anual:");
        tasaMensual = entrada.nextDouble();
        System.out.println("Ingrese el numero de años:");
        año = entrada.nextInt();
        
        double Monto = Capital*(Math.pow((1+tasaMensual),(año*12)));
        System.out.println("El capital acumulado es:" + Monto);
    }
}
