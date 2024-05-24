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
public class ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce milla: ");
        int milla = in.nextInt();
        System.out.println(millas_a_kilometros(milla));
    }
    public static double millas_a_kilometros(int millas){
        return millas * 1.60934;
    }
}
