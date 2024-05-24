/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author neusx
 */
public class ej12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce kilometro: ");
        int kilometro = in.nextInt();
        System.out.println(kilometro_a_millas(kilometro));
    }

    public static double kilometro_a_millas(int kilometros) {
        return kilometros * 0.621371;
    }
}
