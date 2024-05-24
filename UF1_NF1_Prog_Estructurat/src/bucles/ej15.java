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
public class ej15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num = in.nextInt();
        int cont = 0;

        for (int i = 0; i <= num; i++) {
            i = i + 3;
            cont++;
        }
        System.out.println("Cantidad de multiplos de 3: " + cont);
    }
}
