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
public class ej8b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el numero de filas: ");
        int num = in.nextInt();
        Arbol(num, num);

    }

    public static void Arbol(int num, int fila) {
        if (fila == 1) {
            for (int i = 0; i < num - fila; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (2 * fila) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("\n");
        } else {
            for (int i = 0; i < num - fila; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (2 * fila) - 1; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
            Arbol(num, fila - 1);
        }
    }
}
