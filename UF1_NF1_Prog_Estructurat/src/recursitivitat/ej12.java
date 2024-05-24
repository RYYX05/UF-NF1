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
public class ej12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix el dies: ");
        int dias = in.nextInt();
        System.out.println(calorias(dias));
    }
    public static int calorias(int dia){
        if (dia == 0) {
            return dia;
        }else if (dia % 3 == 0){
            return calorias(dia - 1) + 91;
        }else{
            return calorias(dia - 1) + 364;
        }
    }
}
