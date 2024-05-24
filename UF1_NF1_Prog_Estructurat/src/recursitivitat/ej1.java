/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursitivitat;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.printf("El resultat es: %d\n", suma_enters(num));
        } else {
            System.out.println("Ha de ser mes gran que zero.");
        }
    }

    public static int suma_enters(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero + suma_enters(numero - 1);
        }
    }
}
