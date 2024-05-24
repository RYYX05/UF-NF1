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
public class ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Precio 1: ");
        double precio_a = in.nextDouble();
        System.out.println("Precio 2: ");
        double precio_b = in.nextDouble();
        System.out.println("Precio 3: ");
        double precio_c = in.nextDouble();
        System.out.println("Precio 4: ");
        double precio_d = in.nextDouble();
        System.out.println("Precio 5: ");
        double precio_e = in.nextDouble();
        
        System.out.println(precioConIVA(precio_a));
        System.out.println(precioConIVA(precio_b));
        System.out.println(precioConIVA(precio_c));
        System.out.println(precioConIVA(precio_d));
        System.out.println(precioConIVA(precio_e));
        
    }
    public static double precioConIVA(double precio){
        return precio * 1.21;
    }
}
