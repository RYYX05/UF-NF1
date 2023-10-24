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
public class ej3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_adul, num_jun, num_sen, num_dis, num_tot_per, preu_tot, num_entrada_grat;
        /*
        Definimos variables:
        num_adul = Número de personas adultas
        num_jun = Número de personas junior
        num_sen = Número de personas sénior
        num_dis = Número de personas discapacitadas
        num_tot_per = Número de personas en total
        preu_tot = Precio total
        num_entrada_grat = Número de entradas gratis
         */

        System.out.print("Número de personas adultes per a les quals es vol comprar entrades: "); //Pedimos al ususario el número de personas adultas
        num_adul = in.nextInt();
        //Si el número es negativo dará error y lo mismo en los siguientes casos
        if (num_adul < 0) {
            System.out.println("Error");
        }
        System.out.print("Nombre de persones júnior per a les quals es vol comprar entrades: "); //Pedimos al usuario el número de personas junior
        num_jun = in.nextInt();
        if (num_jun < 0) {
            System.out.println("Error");
        }
        System.out.print("Nombre de persones sènior per a les quals es vol comprar entrades: "); //Pedimos al usuario el número de personas sénior
        num_sen = in.nextInt();
        if (num_sen < 0) {
            System.out.println("Error");
        }
        System.out.print("Nombre de persones amb discapacitat per a les quals es vol comprar entrades: "); //Pedimos al usuario el número de personas discapacitadas
        num_dis = in.nextInt();
        if (num_dis < 0) {
            System.out.println("Error");
        }

        num_tot_per = num_adul + num_jun + num_sen + num_dis;

        preu_tot = (num_adul * 40) + (num_jun * 35) + (num_sen * 35) + (num_dis * 29);

        double preu_descuento = (preu_tot * 0.2); //preu_descuento = Precio descuento

        double preu_tot_des = preu_tot - preu_descuento; //preu_tot_des = Precio total con el 20% de descuento

        num_entrada_grat = num_tot_per / 25;

        if (num_tot_per < 10) {
            System.out.println("El número total de personas que forman el grupo es: " + num_tot_per + "\n" + "Formado por: ");
            System.out.println("Número de personas adultas: " + num_adul
                    + "\n" + "Número de personas junior: " + num_jun
                    + "\n" + "Número de personas sénior: " + num_sen
                    + "\n" + "Número de personas discapacitadas: " + num_dis);
            System.out.println("El precio total es de: " + preu_tot + "€");
        } else {
            if (num_tot_per >= 10 && num_tot_per < 25) {
                System.out.println("El número total de personas que forman el grupo es: " + num_tot_per + "\n" + "Formado por: ");
                System.out.println("Número de personas adultas: " + num_adul
                        + "\n" + "Número de personas junior: " + num_jun
                        + "\n" + "Número de personas sénior: " + num_sen
                        + "\n" + "Número de personas discapacitadas: " + num_dis);
                System.out.println("El precio total con un 20 % de descuento es de: " + preu_tot_des + "€");
            } else {
                if (num_adul > 0 && num_adul >= num_entrada_grat) {
                    preu_tot = preu_tot - (num_entrada_grat * 40);
                    double descuento = preu_tot * 0.2;
                    double preu_total = preu_tot - descuento;
                    System.out.println("El número total de personas que forman el grupo es: " + num_tot_per + "\n" + "Formado por: ");
                    System.out.println("Número de personas adultas: " + num_adul
                            + "\n" + "Número de personas junior: " + num_jun
                            + "\n" + "Número de personas sénior: " + num_sen
                            + "\n" + "Número de personas discapacitadas: " + num_dis);
                    System.out.println("El precio total con " + num_entrada_grat + "entrada/s gratis es de: " + preu_total  + "€");
                } else if ((num_adul > 0 && num_adul < num_entrada_grat) && (num_jun>0 ) ){
                    
                }
            }
        }
    }
}

//200 210 
