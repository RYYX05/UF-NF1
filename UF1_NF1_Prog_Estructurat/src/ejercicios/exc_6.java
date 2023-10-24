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
public class exc_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int decimal, residu, quocient;
        String hexadecimal = "";
        System.out.println("Introdueix el valor decimal a convertir en hexadecimal: ");
        decimal = entrada.nextInt();

        do {
            residu = decimal % 16;
            quocient = decimal / 16;
            if (residu <= 0) {
                hexadecimal = String.valueOf(residu);
            } else if (residu == 10) {
                hexadecimal = "A";
            } else if (residu == 11) {
                hexadecimal = "B";
            } else if (residu == 12) {
                hexadecimal = "C";
            } else if (residu == 13) {
                hexadecimal = "D";
            } else if (residu == 14) {
                hexadecimal = "E";
            } else if (residu == 15) {
                hexadecimal = "F";
            } else {
                System.out.println("Error");
            }
            decimal = quocient;

        } while (quocient >= 16);

        hexadecimal = quocient + hexadecimal;
        System.out.println("Num decimal" + decimal + "equival" + hexadecimal);
    }
}
