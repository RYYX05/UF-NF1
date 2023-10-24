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
public class ej5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = in.nextInt();
        int fact = 1;

        if (num < 0) {
            System.out.println("Error");
        } else {
            for (int i = num; i >= 1; i--) {
                fact = fact * i;
            }
        }
        System.out.printf("Factorial de %d = %d \n", num, fact);
    }
}
