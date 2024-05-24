/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author neusx
 */
public class ej9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int num_a = in.nextInt();
        System.out.print("Numero 2: ");
        int num_b = in.nextInt();
        System.out.print("Numero 3: ");
        int num_c = in.nextInt();

        if (numElevado(num_a, num_b) > num_c) {
            System.out.println(numElevado(num_a, num_b)
                    + " es el numero más elevado");
        } else {
            System.out.println(num_c
                    + "es el numero más elevado");
        }
    }

    public static int numElevado(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }
}
