/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej13_v1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatori = new Random();
        int opcio, inici = 1, fi = 101;
        //declarem variable
        boolean trobat = false;
        System.out.print("Piensa un numero");
        do {
            int num = aleatori.nextInt(inici, fi);
            System.out.println("Num aleatori = " + num);
            do {
                System.out.println("lige una opción: ");
                System.out.println("El número és: 1- Igual 2.- Más pequeño 3.- Más grande");
                opcio = in.nextInt();
                if (opcio == 1) {
                    trobat = true;
                    System.out.println("Advinado");
                    System.out.println("El número secreto era el " + num);
                } else if (opcio == 2) {
                    fi = num;
                    System.out.println("Es más pequeño, seguimos buscando...");
                } else if (opcio == 3) {
                    inici = num + 1;
                    System.out.println("Es más grande, seguimos buscando...");
                } else {
                    System.out.println("Opción incorrecte");
                }
            } while (opcio != 1 && opcio != 2 && opcio != 3);
        } while (!trobat);
    }
}
