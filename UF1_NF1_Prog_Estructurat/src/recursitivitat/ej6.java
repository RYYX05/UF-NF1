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
public class ej6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numnero: ");
        int num1 = in.nextInt();
        System.out.println("Suma de los digitos: " + sumar_dig(num1));
    }

    public static int sumar_dig(int n) {
        if (n == 0) {
            return n;
        } else {
            return (n % 10) + sumar_dig(n / 10);
        }
    }
}
