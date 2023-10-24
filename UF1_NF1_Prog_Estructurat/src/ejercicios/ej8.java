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
public class ej8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix la teva edat: ");
        double edad = in.nextInt();

        if (edad < 0) {
            System.out.println("Error");
        } else if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }
}
