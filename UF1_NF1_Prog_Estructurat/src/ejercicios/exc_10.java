package ejercicios;


import static java.lang.System.in;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roli1509
 */
public class exc_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix nota: ");
        double n = in.nextDouble();

        if (n < 0 || n > 10) {
            System.out.println("Error");
        } else if (n < 5) {
            System.out.println("Insuficient");
        } else if (n >= 5 && n <= 6) {
            System.out.println("Suficient");
        } else if (n >= 6 && n <= 7) {
            System.out.println("Bé");
        } else if (n >= 7 && n <= 8) {
            System.out.println("Notable");
        } else if (n >= 9 && n <= 10) {
            System.out.println("Excelent");
        }

    }

}

