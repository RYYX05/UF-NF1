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
public class ej14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cracter que deseas imprimir: ");
        char caracter = in.next().charAt(0);
        System.out.print("Introduce el numero de lineas: ");
        int num = in.nextInt();
        piramide(caracter, num);

    }

    public static void piramide (char caracters, int num_lin ) {
        int x = 1, s = 1;

        for (int i = 1; i <= num_lin; i++) {
            for (int j = x; j <= num_lin; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= s; l++) {
                System.out.print(caracters);
            }
            s += 2;
            x++;
            System.out.println("");
        }
    }
}
