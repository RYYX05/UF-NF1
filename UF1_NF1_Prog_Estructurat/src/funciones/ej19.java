/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 3 numeros: ");
        int num_a = in.nextInt();
        int num_b = in.nextInt();
        int num_c = in.nextInt();

        if (pita(num_a, num_b, num_c)) {
            System.out.println("Es igual");
        } else {
            System.out.println("No es igual");
        }
    }

    public static boolean pita(int a, int b, int c) {
        a = a * a;
        b = b * b;
        c = c * c;

        return c > a && c > b;
    }
}
