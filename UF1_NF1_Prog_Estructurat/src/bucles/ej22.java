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
public class ej22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = in.nextInt();
        int x = 1, s = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = x; j <= num; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= s; l++) {
                System.out.print("*");
            }
            s += 2;
            x++;
            System.out.println("");
        }
    }
}
