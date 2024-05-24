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
public class ej7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el ancho del rectangulo: ");
        double anchos = in.nextDouble();
        System.out.println("Introduce el alto del rectangulo");
        double altos = in.nextDouble();
        System.out.println("Perimetro: ");
        System.out.println(perimetroRectangulo(anchos, altos));
        System.out.println("Area: ");
        System.out.println(areaRectangulo(anchos, altos));
            
    }
    public static double perimetroRectangulo(double ancho, double alto){
        return (ancho + alto) * 2;
    }
    public static double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }
}
