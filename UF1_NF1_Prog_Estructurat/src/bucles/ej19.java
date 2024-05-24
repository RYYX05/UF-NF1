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
public class ej19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
    }
}
