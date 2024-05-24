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
public class ej7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
         
        System.out.println(sacar_mcd(num1, num2));
    }

    public static int sacar_mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return sacar_mcd(b, a % b);
        }
    }
}
