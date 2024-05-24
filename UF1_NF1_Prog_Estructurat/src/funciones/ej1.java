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
public class ej1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num = in.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = in.nextDouble();
        System.out.printf("La mutiplicación de %f i %f = %f"
                , num, num2, multiplica(num, num2));
    }

    public static double multiplica(double a, double b) {
        double multi = a * b;
        return multi;
    }
}
