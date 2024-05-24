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
public class ej10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el dia: ");
        int dia = in.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = in.nextInt();
        System.out.print("Introduce el año: ");
        int año = in.nextInt();

        if (fechaCorrecta(dia, mes, año) == true) {
            System.out.println("Fecha incorrecta");
        } else {
            System.out.println("Fecha correcta");
        }
    }

    public static boolean fechaCorrecta(int d, int m, int a) {
        if ((d < 1 || d > 30) || (m < 1 || m > 12) || (a < 0)) {
            return true;
        } else {
            return false;
        }
    }
}
