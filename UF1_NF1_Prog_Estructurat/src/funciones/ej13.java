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
public class ej13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Precio: ");
        double precio = in.nextDouble();
        System.out.print("Precio con descuento: ");
        double precio_descuento = in.nextDouble();

        System.out.println(descuento(precio, precio_descuento) + "%");
    }

    public static double descuento(double p, double pd) {
        double resultado;
        resultado = (((p - pd) / p) * 100);
        return resultado;
    }
}
