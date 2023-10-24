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
public class ej13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        if (num1 < num2) {
            System.out.printf("%f-%f",num1,num2);
        } else {
            System.out.printf("%f-%f",num2,num1);
        }
    }
}
