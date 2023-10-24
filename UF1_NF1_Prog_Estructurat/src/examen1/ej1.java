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
public class ej1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia, mes, año;//Definimos variables
        
        System.out.print("Introduce un día: ");//Pedimos al usuario que introduzca un día 
        dia = in.nextInt();
        if (dia > 31 || dia < 0) {
            System.out.println("Error");
        }
        System.out.print("Introduce un mes: ");
        mes = in.nextInt();
        if (mes < 0 || mes > 12) {
            System.out.println("Error");
        }
        System.out.print("Introduce un año: ");
        año = in.nextInt();
        if (año < 1900) {
            System.out.println("Error");

        }

        System.out.println(dia + "/" + mes + "/" + año + "/"); //Devolvemos el resulatado
    }
}

/*
Dias de los meses: 
1.- enero 31
2.- febrero 28
3.- marzo 31
4.- abril 30
5.- mayo 31
6.- junio 30
7.- julio 31
8.- agosto 31
9.- septiembre 30
10.- octubre 31
11.- noviembre 30
12.- diciembre 31
 */
