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
public class ej8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el numero de filas: ");
        int num = in.nextInt();
        int fila = 1;
        mostrar_Fila(fila, num);

    }

    public static void mostrar_Fila(int fila, int numfila) {
        if (fila == numfila) {
            for (int i = 0; i < 10; i++) {
                System.out.print("*");
            }
        } else {
            for (int i = 0; i < (numfila - fila); i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (fila * 2 - 1); i++) {
                System.out.print("*");
            }
            System.out.println("");
            mostrar_Fila(fila + 1, numfila);
        }
    }

    /*
    public static void arbol(int num) {

        if (num == 0) {
        } else {
            for (int i = 0; i < (num - 1); i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println("");
            arbol(num - 1);
        }
    }
     */
}
