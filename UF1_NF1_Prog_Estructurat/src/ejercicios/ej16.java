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
public class ej16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix nota: ");
        double n = in.nextDouble();

        if (n < 0 || n > 10) {
            System.out.println("Error");
        } else if (n == 0 || n < 3) {
            System.out.println("Muy deficiente");
        } else if (n == 3 || n < 5) {
            System.out.println("Insuficiente");
        } else if (n == 5 || n < 6) {
            System.out.println("Bien");
        } else if (n == 6 || n < 9) {
            System.out.println("Notable");
        } else if (n == 9 || n <= 10) {
            System.out.println("Excelent");
        }

    }
}
