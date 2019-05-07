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
public class Ejercicio10 {
    public static void main(String[] args) {
        int distancia=14;
        double Dist=distancia/1.6;
        int min = 45;
        int seg = 30;
        int hora = (min*45+seg)/3600;
        double vel = Dist/hora;
        System.out.println("La veocidad es:"+vel);
    }
}

