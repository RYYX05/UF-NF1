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
public class ej10 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 2 numeros: ");
        double num1 = in.nextInt();
        double num2 = in.nextInt();
        
        System.out.println("Suma = " + (num1 + num2));
        System.out.println("Resta = " + (num1 - num2));
        System.out.println("Mutiplicacion = " + (num1 * num2));
        System.out.println("Division = " + (num1/num2));
        
    }
}
