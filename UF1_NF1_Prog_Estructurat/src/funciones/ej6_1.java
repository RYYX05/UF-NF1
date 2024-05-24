
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roli1509
 */
public class ej6_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Precio: ");
            double precios = in.nextDouble();
            System.out.print("Precio con Iva: ");
            System.out.println(precioConIVA(precios));
        }
    }
    
    public static double precioConIVA(double precio) {
        return precio * 1.21;
    }
} 
