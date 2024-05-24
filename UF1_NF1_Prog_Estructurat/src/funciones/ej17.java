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
public class ej17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero primo: ");
            num = in.nextInt();
            comprovar_primo(num);
        } while (num != 0);

    }

    public static void comprovar_primo(int n) {
        int contador = n - 1;
        boolean esprimo = true;
        while (esprimo == true && contador > 1) {
            if (n % contador == 0) {
                esprimo = false;
            }
            contador--;
        }
        if (n == 1) {
            System.out.println("No es primo");
        } else if (esprimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
