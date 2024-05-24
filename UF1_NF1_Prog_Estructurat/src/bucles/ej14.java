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
public class ej14 {

    public static void main(String[] args) {
        int bill500 = 0, bill200 = 0, bill100 = 0, bill50 = 0, bill20 = 0, bill10 = 0, bill5 = 0;
        Scanner imput = new Scanner(System.in);
        System.out.println("Introduzca el precio a pagar: ");
        int precio = imput.nextInt();
        if (precio < 0) {
            System.out.println("Valor introducido deber ser positivo");
        } else {
            if (precio % 5 == 0) {
                while (precio >= 500) {
                    precio = precio - 500;
                    bill500++;
                }
                while (precio >= 200) {
                    precio = precio - 200;
                    bill200++;
                }
                while (precio >= 100) {
                    precio = precio - 100;
                    bill100++;
                }
                while (precio >= 50) {
                    precio = precio - 50;
                    bill50++;
                }
                while (precio >= 20) {
                    precio = precio - 20;
                    bill20++;
                }
                while (precio >= 10) {
                    precio = precio - 10;
                    bill10++;
                }
                while (precio >= 5) {
                    precio = precio - 5;
                    bill5++;
                }
                System.out.printf("%d billetes de 500 \n "
                        + "%d billetes de 200\n "
                        + "%d billetes de 100\n "
                        + "%d billetes de 50\n "
                        + "%d billetes de 20\n "
                        + "%d billetes de 10\n "
                        + "%d billetes de 5\n  ",
                        bill500, bill200, bill100, bill50, bill20, bill10, bill5);
            } else {
                System.out.println("El valor debe ser multiple de 5");
            }
        }
    }
}
