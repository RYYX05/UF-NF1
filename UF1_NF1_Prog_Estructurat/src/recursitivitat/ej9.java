/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursitivitat;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la capital inicial: ");
        double capita = in.nextInt();
        System.out.println("Introduce introduce el interés nominal: ");
        double nom = in.nextInt();
        System.out.println("Introduce el período de tiempo en año: ");
        int año = in.nextInt();
        nom = nom / 100;
        System.out.printf("%.2f\n", capital(capita, nom, año));
    }

    public static double capital(double capi, double nomina, int any) {
        if (any == 0) {
            return capi;
        } else {
            return capital(capi + (capi * nomina), nomina, any - 1);
        }
    }
}
