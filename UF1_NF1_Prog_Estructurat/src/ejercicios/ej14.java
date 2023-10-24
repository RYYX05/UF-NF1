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
public class ej14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double num1 = in.nextInt();
        double num2 = in.nextInt();

        if (num1 < num2) {
            System.out.println(num2 + " es mas grande");
        } else if (num1 == num2) {
            System.out.println("Son iguales");
        } else {
            System.out.println(num1 + " es más grande");
        }
    }
}
