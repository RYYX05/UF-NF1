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
public class ej2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce número: ");
        int num = in.nextInt();
        System.out.println("Introduce exponente: ");
        int expo = in.nextInt();
        System.out.printf("%d^%d = %d\n", num, expo, calcularPotencia(num, expo));
    }
    public static int calcularPotencia(int numero, int exponent) {
        if (exponent == 1) {
            return numero;
        } else {
            return numero * calcularPotencia(numero, exponent - 1);
        }
    }
}
