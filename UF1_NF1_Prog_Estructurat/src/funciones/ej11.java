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
public class ej11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = in.nextInt();
        
        tablaMutiplicar(num);
    }

    public static void tablaMutiplicar(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
