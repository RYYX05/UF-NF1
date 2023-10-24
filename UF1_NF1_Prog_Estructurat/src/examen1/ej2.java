/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: "); //Pedimos al usuario que introduzca un número
        int num = in.nextInt(); //Definimos la variable número
        //Hacemos las condiciones
        if (num % 4 == 0) {
            if (num % 6 == 0) {
                System.out.println("Número es divisible entre 4 y 6");
            } else {
                System.out.println("Número es divisible entre 4 i no entre 6");
            }
        } else {
            if (num % 6 == 0) {
                System.out.println("Número es divisible entre 6 i no entre 4");
            } else {
                System.out.println("Número no es divisible entre 4 ni entre 6");
            }
        }
    }
}
