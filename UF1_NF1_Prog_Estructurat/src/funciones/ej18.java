/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu DNI: ");
        int dni = in.nextInt();
        letra_dni(dni);
    }
    
    public static void letra_dni(int a) {
        int resul = a % 23;

        if (resul < 0 || resul > 23) {
            System.out.println("ERROR");
        } else {
            if (resul == 0) {
                System.out.println("T");
            } else if (resul == 1) {
                System.out.println("R");
            } else if (resul == 2) {
                System.out.println("W");
            } else if (resul == 3) {
                System.out.println("A");
            } else if (resul == 4) {
                System.out.println("G");
            } else if (resul == 5) {
                System.out.println("M");
            } else if (resul == 6) {
                System.out.println("Y");
            } else if (resul == 7) {
                System.out.println("F");
            } else if (resul == 8) {
                System.out.println("P");
            } else if (resul == 9) {
                System.out.println("D");
            } else if (resul == 10) {
                System.out.println("X");
            } else if (resul == 11) {
                System.out.println("B");
            } else if (resul == 12) {
                System.out.println("N");
            } else if (resul == 13) {
                System.out.println("J");
            } else if (resul == 14) {
                System.out.println("Z");
            } else if (resul == 15) {
                System.out.println("S");
            } else if (resul == 16) {
                System.out.println("Q");
            } else if (resul == 17) {
                System.out.println("V");
            } else if (resul == 18) {
                System.out.println("H");
            } else if (resul == 19) {
                System.out.println("L");
            } else if (resul == 20) {
                System.out.println("C");
            } else if (resul == 21) {
                System.out.println("K");
            } else if (resul == 22) {
                System.out.println("E");
            }
        }
    }
}
