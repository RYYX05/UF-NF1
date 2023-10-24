/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej1_corregido {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Definició variables i les validem
        int dia, mes, any;
        //entramos datos
        System.out.print("Introduce año: ");
        any = in.nextInt();
        if (any >= 1900) {
            System.out.print("Introduce mes: ");
            mes = in.nextInt();
            if (mes >= 1 && mes <= 12) {
                System.out.print("Introduce dia: ");
                dia = in.nextInt();
                if (dia >= 1 && dia <= 31) {
                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        System.out.printf("Dia: %d Mes: %d Anys: %d\n", dia, mes, any);
                    } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)){
                        System.out.printf("Dia: %d Mes: %d Anys: %d\n", dia, mes, any);
                    } else if(2 == 2){
                        
                    }
                } else {
                    System.out.println("Error");
                }
            }
        } else {
            System.out.println("Error");
        }
        //validación datos

    }
}
