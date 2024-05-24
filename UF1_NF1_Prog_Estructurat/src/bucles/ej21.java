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
public class ej21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = in.nextInt();
        System.out.print("Introduce un número mayor que el anterior: ");
        int num_2 = in.nextInt();
        int cont = 0;

        for (int i = num; i <= num_2; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                cont++;
            }
        }
        System.out.println("La cantidad de pares son: " + cont);
    }
}
