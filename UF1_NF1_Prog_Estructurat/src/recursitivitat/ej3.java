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
public class ej3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero par: ");
        int num = in.nextInt();
        if (num % 2 != 0) {
            System.out.println("El numero ha de ser par");
        } else {
            System.out.println("La suma de todos los numeros pares = "
                    + suma(num));
        }
    }

    public static int suma(int numero) {
        if (numero == 2) {
            return 2;
        } else {
            return numero + suma(numero - 2);
        }
    }
}
