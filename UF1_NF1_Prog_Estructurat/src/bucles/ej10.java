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
public class ej10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num;
        boolean matricula = false;
        do {
            System.out.print("Nota: ");
            num = in.nextDouble();
            if (num == 10) {
                matricula = true;
            }
        } while (num != -1);
        if (matricula) {
            System.out.println("Hay un 10");
        } else {
            System.out.println("No hay 10");
        }
    }
}
