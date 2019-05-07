/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01;

/**
 *
 * @author Usuario
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int distancia = 24;
        double Dist = distancia*1.6;
        int hora = 1;
        int minuto = 40;
        double Hora = (hora*60+minuto)/60;
        double Vel = Dist/Hora;
        System.out.println("La velocidad es:" +Vel);
        
    }
}
