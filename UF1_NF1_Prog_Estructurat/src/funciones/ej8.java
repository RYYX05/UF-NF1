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
public class ej8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int num = in.nextInt();
        System.out.println(suma1aN(num));
        System.out.println(producto1aN(num));
        System.out.print("Numero intermedio: ");
        System.out.println(intermedio1aN(num));

    }

    public static int suma1aN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma+=i;
        }
        return suma;
    }

    public static int producto1aN(int n) {
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto*=i;
        }
        return producto;
    }

    public static double intermedio1aN(int n) {
        return (1 + n) / 2;
    }
}
