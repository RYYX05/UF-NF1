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
public class exc_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int retorn;
        System.out.println("Introduiex el valor de la compra: ");
        double valor = entrada.nextDouble();
        System.out.println("Introduiex el import a pagar: ");
        double pago = entrada.nextDouble();
        if (pago < valor) {
            System.out.println("Falta dinero, no puedes comprar!");
        } else {
            double canvi = pago - valor;
            System.out.println("El canvi es de :" + canvi);
            if (canvi == 0) {
                System.out.println("Compra exacte, no hi ha canvi!!");
            } else {
                if (canvi >= 50) {
                    retorn = (int) (canvi / 50);
                    System.out.println("Retorno " + retorn + " bitllets de 50");
                    canvi = canvi - retorn * 50;
                }
                if (canvi >= 20) {
                    retorn = (int) (canvi / 20);
                    System.out.println("Retorno " + retorn + " bitllets de 20");
                    canvi = canvi - retorn * 20;
                }
                if (canvi >= 10) {
                    retorn = (int) (canvi / 10);
                    System.out.println("Retorno " + retorn + " bitllets de 10");
                    canvi = canvi - retorn * 10;
                }
                if (canvi >= 5) {
                    retorn = (int) (canvi / 5);
                    System.out.println("Retorno " + retorn + " bitllets de 5");
                    canvi = canvi - retorn * 5;
                }
                if (canvi >= 2) {
                    retorn = (int) (canvi / 2);
                    System.out.println("Retorno " + retorn + " monedes de 2");
                    canvi = canvi - retorn * 2;
                }
                if (canvi >= 1) {
                    retorn = (int) (canvi / 1);
                    System.out.println("Retorno " + retorn + " monedes de 1");
                    canvi = canvi - retorn * 1;
                }
                if (canvi >= 0.50) {
                    retorn = (int) (canvi / 0.50);
                    System.out.println("Retorno " + retorn + " monedes de 0.50");
                    canvi = canvi - retorn * 0.50;
                }
                if (canvi >= 0.20) {
                    retorn = (int) (canvi / 0.20);
                    System.out.println("Retorno " + retorn + " monedes de 0.20");
                    canvi = canvi - retorn * 0.20;
                }
                if (canvi >= 0.10) {
                    retorn = (int) (canvi / 0.10);
                    System.out.println("Retorno " + retorn + " monedes de 0.10");
                    canvi = canvi - retorn * 0.10;
                }
                if (canvi >= 0.05) {
                    retorn = (int) (canvi / 0.05);
                    System.out.println("Retorno " + retorn + " monedes de 0.05");
                    canvi = canvi - retorn * 0.05;
                }
                if (canvi >= 0.02) {
                    retorn = (int) (canvi / 0.02);
                    System.out.println("Retorno " + retorn + " monedes de 0.02");
                    canvi = canvi - retorn * 0.02;
                }
                if (canvi >= 0.01) {
                    retorn = (int) (canvi / 0.01);
                    System.out.println("Retorno " + retorn + " monedes de 0.01");
                }
            }
        }
    }
}
        
 
