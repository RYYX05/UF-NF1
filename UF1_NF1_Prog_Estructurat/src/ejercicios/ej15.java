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
public class ej15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextInt();
        double num2 = in.nextInt();
        double num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el mayor");
        } else {
            System.out.println(num3 + " es el mayor");
        }
    }
}
