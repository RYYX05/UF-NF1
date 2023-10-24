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
public class exc_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introdueix el radi: ");
        double r = in.nextInt();
        System.out.print("Introdueix l'altura: ");
        double a = in.nextInt();

        if (r <= 0 || a <= 0) {
            System.out.println("Error");
        } else {
            double alateral = 2 * Math.PI * r * a;
            double abase = Math.PI * Math.pow(r, 2);
            double atotal = 2 * abase + alateral;
            double v = abase * alateral;
            System.out.println("Area lateral: " + alateral + "\n" + "Area base: " + abase + "\n" + "Area total: " + atotal + "\n" + "Volumen: " + v);
        }
    }

}
