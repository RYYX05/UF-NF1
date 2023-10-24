/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Random;

/**
 *
 * @author roli1509
 */
public class ej13_v2 {

    public static void main(String[] args) {
        Random aleatori = new Random();
        int secret, inici = 1, fi = 101;
        //declaramos variables
        boolean trobat = false;
        secret = aleatori.nextInt(1,101);
        System.out.println("Número secreto generado aleatoriamente:" + secret);
        do {
            int num = aleatori.nextInt(inici, fi);
            System.out.println("Número aleatori = " + num);
            if (num == secret) {
                trobat = true;
                System.out.println("Advinado");
                System.out.println("El número secreto era el " + num);
            } else if (num < secret) {
                inici = num + 1;
                System.out.println("Es más grande, seguimos buscando...");
            } else {
                fi = num;
                System.out.println("Es más pequeño, seguimos buscando...");
            }
        } while (!trobat);
    }
}
