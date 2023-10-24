package ejercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roli1509
 */
public class ej7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una longitud en millas marinas: ");
        double a = in.nextInt();

        if (a < 0) {
            System.out.println("Error");
        } else {
            System.out.println("En metros son: " + a * 1852);
        }
    }
}

