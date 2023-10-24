/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, positiu = 0, negatiu = 0;

        do {
            System.out.println("Introduce 10 números");
            num = in.nextInt();
            if (num < 0) {
                negatiu++;
            } else if (num > 0) {
                positiu++;
            } else {
                System.out.println("Saliendo del programa...");
            }
        } while (num != 0);
        if (negatiu > 0) {
            System.out.println(positiu + " son positivos i " + negatiu + " son negativos");
        } else {
            System.out.println(positiu + " son positivos i " + negatiu + " son negativos");
        }
    }
}
