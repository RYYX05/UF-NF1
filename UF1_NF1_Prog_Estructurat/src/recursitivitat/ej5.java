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
public class ej5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numnero: ");
        int num1 = in.nextInt();
        System.out.print("Numero invertido: ");
        invertir(num1);
    }

    public static void invertir(int num) {
        if (num > 0) {
            System.out.print(num % 10);
            invertir(num/10);
        } 
    }
}
