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
public class ej16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, contador;
        boolean esprimo = true;
        do {
            System.out.print("Dime un n�mero: ");
            n = in.nextInt();
            if (n <= 0) {
                System.out.println("El n�mero debe ser entero y positivo");
            }
        } while (n <= 0);
        contador = n - 1;
        while (esprimo == true && contador > 1) {
            if (n % contador == 0) {
                esprimo = false;
            }
            contador--;
        }
        if (esprimo) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }
    }
}
