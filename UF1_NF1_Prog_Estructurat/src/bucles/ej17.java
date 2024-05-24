/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int cont_num = 0;
        int cont_num_fallados = 0;
        int ant = 0;
        System.out.println("Dime un número inicial: ");
        ant = in.nextInt();

        do {
            System.out.println("Dime un número: ");
            num = in.nextInt();
            cont_num++;
            if (num <= ant && num!=0) {
                System.out.println("Fallo, es menor");
                cont_num_fallados++;
            }
            ant = num;
        } while (num != 0);
        System.out.println("Total de ´umeros: " + cont_num);
        System.out.println("Numeros fallados: " + cont_num_fallados);
    }
}
